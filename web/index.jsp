<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/10/28
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>

    <style>
        body,html{
            width: 100%;
            height: 100%;
            padding: 0;
            margin: 0;
        }
        .bgimg {
            width: 100%;
            height: 100%;
            background-image: url("pic/bgone.jpg");
            background-size: cover;
            animation: animation 1s 0s infinite;
        }

        /*#code {*/
        /*    width: 180px;*/
        /*    height: 38px;*/
        /*    margin: 0px auto;*/
        /*    padding-top: 200px;*/
        /*    text-align: center;*/
        /*    line-height: 38px;*/
        /*    border-radius: 4px;*/
        /*    display: inline-block;*/
        /*}*/
        /*#range {*/
        /*    width: 180px;*/
        /*    height: 38px;*/
        /*    margin: 100px auto;*/
        /*    text-align: center;*/
        /*    line-height: 38px;*/
        /*    border-radius: 4px;*/
        /*    display: inline-block;*/
        /*}*/


        /*#author {*/
        /*    width: 180px;*/
        /*    height: 38px;*/
        /*    margin: 100px auto;*/
        /*    text-align: center;*/
        /*    line-height: 38px;*/
        /*    border-radius: 4px;*/
        /*    display: inline-block;*/
        /*}*/
        .container {
            display:flex;
            align-items: center;
            justify-content: center;
            margin-top: 3rem;
        }
        .tips {
            color: white;
        }
        .items {
            display: flex;
            flex-direction: column;
            margin: auto 2rem;
        }
        .select-item {
            height: 40px;
            padding: .2rem .5rem;
            width: 100%;
        }

        #submit-btn {
            padding: .5rem;
        }

        .main-container {
            padding-top: 30vh;
        }
@keyframes animation {
    50%{
        filter: hue-rotate(360deg);
    }

}


    </style>
</head>

<body>



   <div class="bgimg">
        <form action="${pageContext.request.contextPath}/main" method="get">
            <div class="main-container">
                <div class="container">
                    <div id="code" class="items">
                        <div class="tips">Language</div>
                        <select name="code" class="select-item">
                            <option value="Java">Java</option>
                            <option value="Python">Python</option>
                            <option value="C++">C++</option>
                        </select>
                    </div>


                    <div id="range" class="items">
                        <div class="tips">Range</div>
                        <select name="range" class="select-item">
                            <option value="daily">Today</option>
                            <option value="weekly">This week</option>
                            <option value="monthly">This month</option>
                        </select>
                    </div>


                    <div id="author" class="items">
                        <div class="tips">Spoken-Language</div>
                        <select name="author" class="select-item">
                            <option value="en">English</option>
                            <option value="zh">Chinese</option>
                        </select>
                    </div>
                </div>
                <div class="container">
                    <input type="submit" value="提交" id="submit-btn">
                </div>
            </div>
        </form>
    </div>

</body>
</html>
