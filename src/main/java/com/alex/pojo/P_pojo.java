package com.alex.pojo;

public class P_pojo {
    private  String p_name;
    private String p_star_branch;
    private String p_detail;
    private String p_main_contributors;


    public P_pojo() {
    }


    public P_pojo(String p_name, String p_star_branch, String p_detail, String p_main_contributors) {
        this.p_name = p_name;
        this.p_star_branch = p_star_branch;
        this.p_detail = p_detail;
        this.p_main_contributors = p_main_contributors;
    }

    @Override
    public String toString() {
        return "P_pojo{" +
                "p_name='" + p_name + '\'' +
                ", p_star_branch='" + p_star_branch + '\'' +
                ", p_detail='" + p_detail + '\'' +
                ", p_main_contributors='" + p_main_contributors + '\'' +
                '}';
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_star_branch() {
        return p_star_branch;
    }

    public void setP_star_branch(String p_star_branch) {
        this.p_star_branch = p_star_branch;
    }

    public String getP_main_contributors() {
        return p_main_contributors;
    }

    public void setP_main_contributors(String p_main_contributors) {
        this.p_main_contributors = p_main_contributors;
    }

    public String getP_detail() {
        return p_detail;
    }

    public void setP_detail(String p_detail) {
        this.p_detail = p_detail;
    }
}
