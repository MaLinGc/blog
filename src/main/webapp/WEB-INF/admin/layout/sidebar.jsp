<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/global/global.jsp" %>
<aside id="sidebar" class="sidebar c-overflow">
    <div class="s-profile">
        <a href="" data-ma-action="profile-menu-toggle">
            <div class="sp-pic">
                <img src="${staticPath}/img/demo/profile-pics/1.jpg" alt="" class="mCS_img_loaded">
            </div>

            <div class="sp-info">
                Malinda Hollaway

                <i class="zmdi zmdi-caret-down"></i>
            </div>
        </a>

        <ul class="main-menu">
            <li>
                <a href="profile-about.html"><i class="zmdi zmdi-account"></i> View Profile</a>
            </li>
            <li>
                <a href=""><i class="zmdi zmdi-input-antenna"></i> Privacy Settings</a>
            </li>
            <li>
                <a href=""><i class="zmdi zmdi-settings"></i> Settings</a>
            </li>
            <li>
                <a href=""><i class="zmdi zmdi-time-restore"></i> Logout</a>
            </li>
        </ul>
    </div>

    <ul class="main-menu">
        <li><a href="index.html"><i class="zmdi zmdi-home"></i> 首页</a></li>
        <li><a href="index.html"><i class="zmdi zmdi-home"></i> 博客管理</a></li>
        <li><a href="index.html"><i class="zmdi zmdi-home"></i> 用户管理</a></li>
        <li><a href="index.html"><i class="zmdi zmdi-home"></i> 标签管理</a></li>
        <li class="sub-menu">
            <a href="" data-ma-action="submenu-toggle"><i class="zmdi zmdi-chart"></i> 网站设置</a>
            <ul>
                <li><a href="dashboards/analytics.html">网站信息</a></li>
                <li><a href="dashboards/school.html">友链管理</a></li>
            </ul>
        </li>
    </ul>
</aside>