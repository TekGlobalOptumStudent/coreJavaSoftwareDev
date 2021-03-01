package softwareDev;

import java.util.ArrayList;

public class SoftwareDeveloperClub {
	
	private static ArrayList<ClubMember> clubMembers;
	
	public SoftwareDeveloperClub() {
		clubMembers = new ArrayList<ClubMember>();
	}
	
	public void addClubMember(ClubMember clubMember) {
		clubMembers.add(clubMember);
	}
	
	public void removeClubMember(int index) {
		clubMembers.remove(index);
	}
	
	public static ArrayList<ClubMember> getClubMembers(){
		return clubMembers;
	}
	
	public static void printClubMembers() {
		for(int i = 0; i < clubMembers.size(); i++) {
			ClubMember cm = clubMembers.get(i);
			System.out.println("Member at index " + i);
			System.out.println("Name: " + cm.getName());
			System.out.println("Location: " + cm.getLocation());
			System.out.println("Language: " + cm.getLanguage());
		}
	}
}
