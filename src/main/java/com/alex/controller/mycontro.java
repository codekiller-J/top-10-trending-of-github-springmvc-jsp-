package com.alex.controller;

import com.alex.pojo.P_pojo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

@Controller
public class mycontro {

    @RequestMapping("/main")
    public String main(String code, String range, String author, Model model) throws IOException {
        P_pojo p_pojo=new P_pojo();

        List<P_pojo> list_p_pojo = new LinkedList<>();

        String[] p_name = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        String[] p_name_nocomma=new String[10];
        String[] pre_star_branch = new String[20];
        String[] p_star_branch = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        String[] p_main_contributors = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        String[] p_detail = new String[1000];
        String url = "https://github.com/trending/" + code + "?since=" + range + "&spoken_language_code=" + author;
        Document document = Jsoup.parse(new URL(url), 50000);
        Elements elements = document.getElementsByClass("h3 lh-condensed");
        Elements elements1 = document.getElementsByClass("muted-link d-inline-block mr-3");
        Elements elements2 = document.getElementsByClass("avatar mb-1 avatar-user");
        Elements elements3 = document.getElementsByClass("col-9 text-gray my-1 pr-4");

        System.out.println(url);
        System.out.println(code);
        System.out.println(range);
        System.out.println(author);

        for (int i = 0; i < 10; i++) {
            p_name[i] = elements.get(i).text() + ",";
            p_name[i] = p_name[i].replaceAll(" ", "");
        }


        for (int i = 0; i < 10; i++) {
            p_name_nocomma[i] = elements.get(i).text();
            p_name_nocomma[i] = p_name_nocomma[i].replaceAll(" ", "");
        }



        for (int i = 0; i < 20; i++) {
            pre_star_branch[i] = elements1.get(i).text();
            pre_star_branch[i] = pre_star_branch[i].replaceAll(",", "");
        }

        for (int i = 0; i < 10; i++) {
            p_star_branch[i] = "stargazer:" + pre_star_branch[i * 2] + ",";
        }

        for (int i = 0; i < 10; i++) {
            p_star_branch[i] = p_star_branch[i] + "forks:" + pre_star_branch[i * 2 + 1] + ",";
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i * 5, k = j + 5; j < k; j++) {
                p_main_contributors[i] = p_main_contributors[i] + elements2.get(j).attr("alt") + ",";
            }
        }

        for (int i = 0; i < 10; i++) {
            p_detail[i] = elements3.get(i).text();
        }


//        for (String a:p_detail){
//            System.out.println(a);
//        }
//        for (String s : p_name) {
//            list_p_name.add(s);
//        }
//        for (String s : p_star_branch) {
//            list_p_star_branch.add(s);
//        }
//        for (String s : p_main_contributors) {
//            list_p_main_contributors.add(s);
//        }
//        for (String s : p_detail) {
//            list_p_detail.add(s);
//        }
//
//        Model model_p_name = model.addAttribute("p_name", list_p_name);
//        Model model_p_star_branch = model.addAttribute("p_star_branch", list_p_star_branch);
//        Model model_p_main_contributors = model.addAttribute("p_main_contributors", list_p_main_contributors);
//        Model model_p_detal = model.addAttribute("p_detail", list_p_detail);

        for (int i=0;i<10;i++){
//            p_pojo.setP_name(p_name[i]);
//            p_pojo.setP_star_branch(p_star_branch[i]);
//            p_pojo.setP_detail(p_detail[i]);
//            p_pojo.setP_main_contributors(p_main_contributors[i]);
            list_p_pojo.add(new P_pojo(p_name_nocomma[i],p_star_branch[i],p_detail[i],p_main_contributors[i]));
        }


        
        for (P_pojo p:list_p_pojo){
            System.out.println(p);
        }
            model.addAttribute("list",list_p_pojo);
        return "show";

    }

}
