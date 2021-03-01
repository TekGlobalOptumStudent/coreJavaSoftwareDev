package softwareDev;

import java.io.File;
import java.util.Scanner;

public class ClubMemberApp {
	
	public static void main(String[] args) {
		SoftwareDeveloperClub sdc = new SoftwareDeveloperClub();
		try {
			File file = new File("src\\softwareDev\\members.txt");
			Scanner sc = new Scanner(file);
			sc.nextLine();
			while(sc.hasNextLine()) {
				String[] data = sc.nextLine().trim().split("\\*\\*");
				sdc.addClubMember(new ClubMember(data[0], data[1], data[2]));
			}
			sc.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		Scanner in = new Scanner(System.in);
		runSystemLoop(in, sdc);
		in.close();
	}
	
	public static void runSystemLoop(Scanner in, SoftwareDeveloperClub sdc) {
		while(true) {
			System.out.println("Select from the following menu:");
			System.out.println("1. Display Members");
			System.out.println("2. Remove Member");
			System.out.println("3. Add Member");
			System.out.println("4. Quit");
			int choice = in.nextInt();
			switch(choice) {
				case 1:
					System.out.println("----------");
					SoftwareDeveloperClub.printClubMembers();
					System.out.println("----------");
					break;
				case 2:
					System.out.println("----------");
					System.out.print("Enter member index to remove: ");
					int index = -1;
					try {
						index = in.nextInt();
						sdc.removeClubMember(index);
						System.out.println("Member at index " + index + " has been successfully removed.");
					} catch(Exception e) {
						System.out.println("No member found at index " + index);
					}
					System.out.println("----------");
					break;
				case 3:
					in.nextLine();
					String[] data = new String[3];
					System.out.println("----------");
					System.out.print("Enter member name: ");
					data[0] = in.nextLine().trim();
					System.out.print("Enter member location: ");
					data[1] = in.nextLine().trim();
					System.out.print("Enter member langauge: ");
					data[2] = in.nextLine().trim();
					sdc.addClubMember(new ClubMember(data[0], data[1], data[2]));
					System.out.println("Club member succesfully added.");
					System.out.println("----------");
					break;
				default:
				case 4:
					System.out.println("Quitting...");
					return;
			}
		}
	}
}
