$(function(){
	$("#reviewForm").hide();
	$("#btn_add_review").click(function(){
		$("#reviewForm").toggle();
	  });
	
	$('#btn_add').click(addReview);
	
	function addReview(){
		var reviewerName = $('#reviewer_name').val();
		var reviewText = $('#review_text').val();
		var reviewScore = $('#review_score').val();

		
		var review = {reviewerName:reviewerName, reviewText:reviewText, reviewScore:reviewScore};
		
		$.post('review',{review: JSON.stringify(review)}, processData, "json")

		var stars = [46, 86 , 128, 170, 211];
        var x = 0;
		var y = -stars[reviewScore-1];
		//var avgScore = 	$( ".review" ).length+"/5");
		var totalReviews = 	$( ".review" ).length;

		$(".averageStars").css({"backgroundPosition": -x + 'px ' + (-y) + 'px' });
		$(".reviewCount").text("Total " + totalReviews + " reviews");
		$("#reviewForm").hide(700);
	
	}

	function processData(data){
		//data = JSON.parse(data);

		var newReview = "<div class='review'>" +
							"<div class='score'>" + data.reviewScore + "/5</div>" +
							"<div class='name'>" + data.reviewerName + "</div>" +
							"<div class='date'>2019.07.12</div>" +
							"<div class='text'><span>" + data.reviewText + "</span></div>" +
						"</div>";

		$('.review').first().before(newReview);

	}


})

