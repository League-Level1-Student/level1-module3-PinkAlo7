package _04_netflix;

public class WhatWillTheBestMovieBe {
	public static void main(String[] args) {
		Movie wicked = new Movie("Wicked", 5);
		Movie dune = new Movie("Dune", 1);
		Movie aWonderfulLife = new Movie("It's a Wonderful Life", 2);
		Movie shrek = new Movie("Shrek", 3);
		Movie tombRaider = new Movie ("Tomb Raider", 4);
		Movie cartoonCinderella = new Movie("Cinderella", 4);
		Movie recentCinderella = new Movie("2015 Cinderella", 5);
		
		System.out.println( wicked.getTicketPrice());
		
		NetflixQueue primeVideo = new NetflixQueue();
		primeVideo.addMovie(recentCinderella);
		primeVideo.addMovie(wicked);
		primeVideo.addMovie(dune);
		primeVideo.addMovie(aWonderfulLife);
		primeVideo.addMovie(shrek);
		primeVideo.addMovie(tombRaider);
		primeVideo.addMovie(cartoonCinderella);
	
		primeVideo.sortMoviesByRating();
	
		primeVideo.printMovies();
		
		
		System.out.println( primeVideo.getBestMovie().getTitle() );
		System.out.println(primeVideo.getMovie(1).getTitle());
	
		
		
	
		
	}
}
