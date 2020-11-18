<!DOCTYPE html>
<html lang="en">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%request.setCharacterEncoding("UTF-8");%>



<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>register info</title>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Icons font CSS-->
    <link href="Kelly/assets/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="Kelly/assets/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="Kelly/assets/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="Kelly/assets/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="Kelly/colorlib-regform-2/colorlib-regform-2/css/main.css" rel="stylesheet" media="all">
    
        
    <script>
    $(document).ready(function(){
    	alert("해당 유형의 데이터가 없습니다. 다시 선택해주세용");
    	});
    </script>
    
</head>

<body>
    <div class="page-wrapper bg-red p-t-180 p-b-100 font-robo">
        <div class="wrapper wrapper--w960">
            <div class="card card-2">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Registration Info</h2>
                    <form action="/price" method="POST">
                    	<div class="input-group">
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="loc">
                                    <option disabled="disabled" selected="selected">지역</option>
                                    <option value="gangwon">강원</option>
									<option value="gyeonggi">경기</option>
									<option value="gyeongnam">경남</option>
									<option value="gyungbuk">경북</option>
									<option value="gwangju">광주</option>
									<option value="daegu">대구</option>
									<option value="daejeon">대전</option>
									<option value="busan">부산</option>
									<option value="seoul">서울</option>
									<option value="sejong">세종</option>
									<option value="ulsan">울산</option>
									<option value="incheon">인천</option>
									<option value="jeonnam">전남</option>
									<option value="jeonbuk">전북</option>
									<option value="jeju">제주</option>
									<option value="chungnam">충남</option>
									<option value="chungbuk">충북</option>	
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="age">
                                    <option disabled="disabled" selected="selected">나이</option>
									<option value="10s">10대</option>
									<option value="20s">20대</option>
									<option value="30s">30대</option>
									<option value="40s">40대</option>
									<option value="50s">50대</option>
									<option value="60s">60대</option>
									<option value="70s">70대</option>
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="sex">
                                    <option disabled="disabled" selected="selected">성별</option>
                                    <option value="1">남자</option>
                                    <option value="2">여자</option>
 
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="flc">
                                    <option disabled="disabled" selected="selected">가구유형</option>
									<option value="1">1인가구</option>
									<option value="2">영유아자녀가구</option>
									<option value="3">중고생자녀가구</option>
									<option value="4">성인자녀가구</option>
									<option value="5">노년가구</option>
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>

                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                   <div class="rs-select2 js-select-simple select--no-search">
                                        <select name="startDate">
                                            <option disabled="disabled" selected="selected">시작</option>
                                            <option value="201901">1월</option>
											<option value="201902">2월</option>
											<option value="201903">3월</option>
											<option value="201904">4월</option>
											<option value="201905">5월</option>
											<option value="201906">6월</option>
											<option value="201907">7월</option>
											<option value="201908">8월</option>
											<option value="201909">9월</option>
											<option value="201910">10월</option>
											<option value="201911">11월</option>
											<option value="201912">12월</option>
                                        </select>
                                        <div class="select-dropdown"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                               <div class="input-group">
                                   <div class="rs-select2 js-select-simple select--no-search">
                                        <select name="endDate">
                                            <option disabled="disabled" selected="selected">끝</option>
                                            <option value="201901">1월</option>
											<option value="201902">2월</option>
											<option value="201903">3월</option>
											<option value="201904">4월</option>
											<option value="201905">5월</option>
											<option value="201906">6월</option>
											<option value="201907">7월</option>
											<option value="201908">8월</option>
											<option value="201909">9월</option>
											<option value="201910">10월</option>
											<option value="201911">11월</option>
											<option value="201912">12월</option>
                                        </select>
                                        <div class="select-dropdown"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                      
                        <div class="p-t-30">
                            <button class="btn btn--radius btn--green" type="submit">완료</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="Kelly/colorlib-regform-2/colorlib-regform-2/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="Kelly/colorlib-regform-2/colorlib-regform-2/vendor/select2/select2.min.js"></script>
    <script src="Kelly/colorlib-regform-2/colorlib-regform-2/vendor/datepicker/moment.min.js"></script>
    <script src="Kelly/colorlib-regform-2/colorlib-regform-2/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="Kelly/colorlib-regform-2/colorlib-regform-2/js/global.js"></script>

</body>

</html>
<!-- end document-->