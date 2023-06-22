<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>


<style>
* {
	padding: 0;
	margin: 0;
}

body {
	box-sizing: border-box;
}

.container {
	width: 90vw;
	height: 60vh;
	margin: 0px auto;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-wrap: wrap;
}

.subcontainer {
	width: 23vw;
	margin-bottom: 10px;
}

.subcontainer>.image>img {
	height: 30vh;
	width: 100%;
}

.subcontainer .para, .para1, .para2, .para3, .para4 {
	background-color: rgba(216, 197, 197, 0.456);
	width: 85%;
	padding-left: 6%;
	padding-bottom: 5%;
	margin: 0px auto;
}

.image {
	margin: 0px auto;
	width: 90%;
}

.para1 {
	/* display: flex;
    justify-content: center;
    align-items: center; */
	padding: 10px;
}

#bot {
	border-radius: 5px;
}

#loc {
	padding: -2px;
}

#back {
	background-color: black;
	color: whitesmoke;
	height: 50px;
	width: 150px;
	display: flex;
	align-items: center;
	justify-content: center;
}

#back1 {
	color: whitesmoke;
	text-decoration: none;
}
.rating {
	font-size: 15px;
}

.clicked {
	color: yellow;
}
</style>
<body>
	<button>
		<div id="back">
			<a href="/Home.jsp" id="back1">BACK</a>
		</div>
	</button>
	
		<div class="subcontainer">
			<div class="image">
				<img src="../photos/france.jpg" alt="">
			</div>
			<div class="para">
				<span class="material-symbols-outlined"> location_on </span>PARIS
			</div>
			<div class="para1">France is stunning country and it is full of
				culture attractions, renowned food and win,and alluring landscapes.</div>
			<div class="para2">
				<link
					href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
					rel="stylesheet" />

				<style>

</style>
				</head>

				<body>

					<div class="rating">
						<i class="fa fa-star clicked"></i> <i class="fa fa-star clicked"></i>
						<i class="fa fa-star clicked"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i>
					</div>
			</div>
			<div class="para3">INR 78,954</div>
			<div class="para4">
				<button id="bot"
					style="background-color: rgb(4, 170, 109); color: black; border-color: rgb(4, 170, 109);">
					<a href="/booking.jsp?name=FRANCE">Book Now</a>
				</button>
			</div>
		</div>

		<div class="subcontainer">
			<div class="image">
				<img src="../photos/las vegas.jpg" alt="">
			</div>
			<div class="para">
				<span class="material-symbols-outlined"> location_on </span>LAS
				VEGAS
			</div>
			<div class="para1">It is home to most famous hotels and casinos
				in the city that makes most visited avenues in the world.</div>
			<div class="para2">
				<link
					href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
					rel="stylesheet" />

				<style>
.rating {
	font-size: 15px;
}

.clicked {
	color: yellow;
}
</style>
				</head>

				<body>

					<div class="rating">
						<i class="fa fa-star clicked"></i> <i class="fa fa-star clicked"></i>
						<i class="fa fa-star clicked"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i>
					</div>
			</div>
			<div class="para3">INR 80,000</div>
			<div class="para4">
				<button id="bot"
					style="background-color: rgb(4, 170, 109); color: black; border-color: rgb(4, 170, 109);">
					<a href="/booking.jsp?name=LAS VEGAS">Book Now</a>
				</button>
			</div>
		</div>
		<div class="subcontainer">
			<div class="image">
				<img src="../photos/londaon.jpg" alt="">
			</div>
			<div class="para">
				<span id="loc" class="material-symbols-outlined"> location_on
				</span>LONDON
			</div>
			<div class="para1">Big ben, Tower of London, Tower Bridge,
				London eye, Buckingham Palace,Hyde Park and many more famous sights
				attract tourist.</div>
			<div class="para2">
				<link
					href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
					rel="stylesheet" />

				<style>
.rating {
	font-size: 15px;
}

.clicked {
	color: yellow;
}
</style>
				</head>

				<body>

					<div class="rating">
						<i class="fa fa-star clicked"></i> <i class="fa fa-star clicked"></i>
						<i class="fa fa-star clicked"></i> <i class="fa fa-star clicked"></i>
						<i class="fa fa-star"></i>
					</div>
			</div>
			<div class="para3">INR 94,500</div>
			<div class="para4">
				<button id="bot"
					style="background-color: rgb(4, 170, 109); color: black; border-color: rgb(4, 170, 109);">
					<a href="/booking.jsp?name=LONDON">Book Now</a>
				</button>
			</div>
		</div>
	




	</div>


</body>
</html>