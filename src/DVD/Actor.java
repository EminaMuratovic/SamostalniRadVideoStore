package DVD;

import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Creates an actor
 * @author eminamuratovic
 *
 */
public class Actor {
	private String actorName;
	private String actorSurname;
	
	/**
	 * creates an actor
	 * @param actorName String name of thi actor
	 * @param actorSurname String surname of the actor
	 */
	public Actor(String actorName, String actorSurname) {
		this.actorName = actorName;
		this.actorSurname = actorSurname;
	}
	
	/**
	 * creates a string representation of the actor
	 */
	public String toString() {
		String str = "";
		str += "\n   Name of the actor: " + actorName;
		str += "\n   Surname of the actor: " + actorSurname;
		return str;
	}

	/**
	 * gets the name of the actor
	 * @return name of the actor
	 */
	public String getActorName() {
		return actorName;
	}

	/**
	 * gets the surname of the actor
	 * @return surname of the actor
	 */
	public String getActorSurname() {
		return actorSurname;
	}
	
	/**
	 * creates xml form of the actor
	 * @param actor Actor given actor
	 * @param os OutputStream
	 */
	public void actorToXML(Actor actor, OutputStream os) {
		PrintWriter pw = new PrintWriter(os);
		pw.println("<actor>");
		pw.println("	<actorName>" + actor.actorName + "</actorName>");
		pw.println("	<actorSurname>" + actor.actorSurname + "</actorSurname>");
		pw.println("</actor>");
		pw.flush();
	}
	
	
	

}
