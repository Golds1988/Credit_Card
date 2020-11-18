<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



   
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>배민수동-about</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="Kelly/assets/img/favicon.png" rel="icon">
  <link href="Kelly/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="Kelly/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="Kelly/assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="Kelly/assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="Kelly/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="Kelly/assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="Kelly/assets/vendor/aos/aos.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="Kelly/assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Kelly - v2.0.0
  * Template URL: https://bootstrapmade.com/kelly-free-bootstrap-cv-resume-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">

      <h1 class="logo"><a href="index.html">Credit Card Recommendation</a></h1>
      <!-- Uncomment below if you prefer to use an image logo -->
      <!-- <a href="index.html" class="logo"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

      <nav class="nav-menu d-none d-lg-block">
        <ul>
           <li class="active"><a href="index.html">Home</a></li>
          <li><a href="/Kelly/colorlib-regform-2/colorlib-regform-2/index.jsp">나만의 카드 찾기</a></li>
          <li><a href="/Kelly/portfolio.html">혜택별 추천</a></li>
        </ul>
      </nav><!-- .nav-menu -->


    </div>

  </header><!-- End Header -->

       

  <main id="main">
  <!-- ======= About Section ======= -->
    <section id="about" class="about">
      <div class="container" data-aos="fade-up">
    

        <div class="section-title">
         <class="nav-menu d-none d-lg-block">
          <h2>사용자 정보</h2>
         
        </div>

        <div class="row">
          <div class="col-lg-7 pt-3 pt-lg-0 content">
          
            <h3>${userInfoList[0]}부터 ${userInfoList[1]}까지 총 소비 금액</h3>
            
             <section id="facts" class="facts">
            <div class="container" data-aos="fade-up">
              <div class = row>
              <div class="counters2 col-md-3">
      
                <div class=" text-center" >
                  <span data-toggle="counter-up">${sum}</span>
                
                </div>
              </div>
       </div>
            </div>
          </section>
          
          </div>
          <div class="col-lg-5 pt-3 pt-lg-0 content">
            <h3></h3>
          
            <div class="row">
          
              <div class="col-lg-15">
                 <ul>
                  <li><i class="icofont-rounded-right"></i> <strong>지역 :</strong> ${userInfoList[5]}</li>
                  <li><i class="icofont-rounded-right"></i> <strong>나이 :</strong> ${userInfoList[4]}</li>
                  <li><i class="icofont-rounded-right"></i> <strong>성별 :</strong> ${userInfoList[2]}</li>
                  <li><i class="icofont-rounded-right"></i> <strong>가구 유형 :</strong> ${userInfoList[3]} </li>
                </ul>
              </div>
            </div>
           
          </div>
        </div>

      </div>
    </section>
    <!-- End About Section -->
  

    <!-- ======= Skills Section ======= -->
    <section id="skills" class="skills">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>소비패턴 분석</h2>
        </div>

        <div class="row skills-content">

          <div class="col-lg-6">
	 			<c:forEach items="${priceList1}" var="vo">
		 			<div class="progress">
		              <span class="skill">${vo.cname}<i class="val">${vo.per}%</i></span>
		              <div class="progress-bar-wrap">
		                <div class="progress-bar" role="progressbar" aria-valuenow="${(vo.per)*3}" aria-valuemin="20" aria-valuemax="40"></div>
		              </div>
		            </div>
	 			</c:forEach>
	        </div>
	 	 	<div class="col-lg-6">
	 			<c:forEach items="${priceList2}" var="vo">
		 			<div class="progress">
		              <span class="skill">${vo.cname}<i class="val">${vo.per}%</i></span>
		              <div class="progress-bar-wrap">
		                <div class="progress-bar" role="progressbar" aria-valuenow="${(vo.per)*3}" aria-valuemin="20" aria-valuemax="40"></div>
		              </div>
		            </div>
	 			</c:forEach>
	        </div>

      </div>
    </section><!-- End Skills Section -->

    <!-- ======= Facts Section ======= -->
    <section id="facts" class="facts">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>소비 금액</h2>
        </div>

        <div class="row counters">
			<c:forEach items="${priceList1}" var="vo">
				<div class="col-lg-3 col-6 text-center">
            		<span data-toggle="counter-up">${vo.pformat}</span>
            		<p>${vo.cname}</p>
          		</div>	
          </c:forEach>
          <fmt:formatNumber type="number" value="${resultList.totAmt}"/>
          <c:forEach items="${priceList2}" var="vo">
				<div class="col-lg-3 col-6 text-center">
            		<span data-toggle="counter-up">${vo.pformat}</span>
            		<p>${vo.cname}</p>
          		</div>	
          </c:forEach>
        </div>

      </div>
    </section><!-- End Facts Section -->

    <!-- ======= Testimonials Section ======= -->
    <section id="testimonials" class="testimonials">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>맞춤 카드 추천</h2>
        </div>

        <div class="owl-carousel testimonials-carousel">

          <c:forEach items="${cardList}" var="vo">
          		<div class="testimonial-item">
		            <img src="${vo.img}" class="testimonial-img" alt="">
		            <h3>${vo.name}</h3>
		            <h4><a href="${vo.url}">카드상세정보</a></h4>
		          
		        </div>
          </c:forEach>
          <!-- <div class="testimonial-item">
            <img src="assets/img/testimonials/testimonials-1.jpg" class="testimonial-img" alt="">
            <h3>Saul Goodman</h3>
            <h4>Ceo &amp; Founder</h4>
          
          </div>

          <div class="testimonial-item">
            <img src="assets/img/testimonials/testimonials-2.jpg" class="testimonial-img" alt="">
            <h3>Sara Wilsson</h3>
            <h4>Designer</h4>
           
          </div>

          <div class="testimonial-item">
            <img src="assets/img/testimonials/testimonials-3.jpg" class="testimonial-img" alt="">
            <h3>Jena Karlis</h3>
            <h4>Store Owner</h4>
           
          </div>

          <div class="testimonial-item">
            <img src="assets/img/testimonials/testimonials-4.jpg" class="testimonial-img" alt="">
            <h3>Matt Brandon</h3>
            <h4>Freelancer</h4>
          
          </div>

          <div class="testimonial-item">
            <img src="assets/img/testimonials/testimonials-5.jpg" class="testimonial-img" alt="">
            <h3>John Larson</h3>
            <h4>Entrepreneur</h4>
           
          </div>

 -->        </div>

      </div>
    </section><!-- End Testimonials Section -->

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <div class="copyright">
        &copy;  <strong><span>배민수동</span></strong>
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/kelly-free-bootstrap-cv-resume-html-template/ -->
        Designed by <a href="https://bootstrapmade.com/">뚜효닝</a>
      </div>
    </div>
  </footer><!-- End  Footer -->

  <div id="preloader"></div>
  <a href="#" class="back-to-top"><i class="bx bx-up-arrow-alt"></i></a>

  <!-- Vendor JS Files -->
  <script src="Kelly/assets/vendor/jquery/jquery.min.js"></script>
  <script src="Kelly/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="Kelly/assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="Kelly/assets/vendor/php-email-form/validate.js"></script>
  <script src="Kelly/assets/vendor/waypoints/jquery.waypoints.min.js"></script>
  <script src="Kelly/assets/vendor/counterup/counterup.min.js"></script>
  <script src="Kelly/assets/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="Kelly/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="Kelly/assets/vendor/venobox/venobox.min.js"></script>
  <script src="Kelly/assets/vendor/aos/aos.js"></script>

  <!-- Template Main JS File -->
  <script src="Kelly/assets/js/main.js"></script>

</body>

</html>