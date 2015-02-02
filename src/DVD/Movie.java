package DVD;

import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Makes a movie.
 * @author eminamuratovic
 *
 */
public class Movie {
	private String title;
	private String genre;
	private Actor[] actors;
	private int movieID;
	private int rate; // from 0-5
	private int size;
	
	/**
	 * creates a movie
	 * @param movieID int movie ID
	 * @param title String title of the movie
	 * @param genre String genre of the movie
	 * @param rate int rate of the movie
	 */
	public Movie(int movieID, String title, String genre, int rate) {
		size = 0;
		actors = new Actor[5];
		this.movieID = movieID;
		this.title = title;
		this.genre = genre;
		this.rate = rate;
	}
	
	/**
	 * @return the movieID
	 */
	public int getMovieID() {
		return movieID;
	}

	/**
	 * prints movie in the string
	 * @return printed movie
	 */
	public String printMovie() {
		String str = "";
		str += " Title: " + title;
		str += "\n  Genre: " + genre;
		str += "\n  Movie ID:" + movieID;
		str += "\n  Rate: " + rate;
		str += "\n  Actors: ";
		for (int i = 0; i < size; i++) {
			str += actors[i].toString();
		}
		str += "\n\n";
		return str;
	}
	
	/**
	 * adds an actor in the movie
	 * @param actor Actor
	 */
	public void addActor(Actor actor) {
		if (size == actors.length)
			resize();
		actors[size] = actor;
		size++;
	}
	
	/**
	 * resizes actors array
	 */
	private void resize() {
		Actor[] array = new Actor[size + 1];
		for (int i = 0; i < actors.length; i++)
			array[i] = actors[i];
		actors = array;
	}
	
	/**
	 * creates xml form of the movie
	 * @param movie Movie given movie
	 * @param os OutputStream
	 */
	public void movieToXML(OutputStream os) {
		PrintWriter pw = new PrintWriter(os);
		pw.println("<movie title = \"" + title
				+ "\" genre = \"" + genre
				+ "\" movieID = \"" +movieID
				+ "\" rate = \"" + rate + "\" >");
		for (int i = 0; i < size; i++) {
			pw.println("	<actor actorName = \"" + actors[i].getActorName()
					+ "\" actorSurname = \"" + actors[i].getActorSurname() + "\" />");
		}
		pw.println("</movie>");
		pw.flush();
	}

}
