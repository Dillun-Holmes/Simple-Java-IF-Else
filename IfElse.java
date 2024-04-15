public class IfElse {
    public static void main(String[] args) {
        String course = "Cad"; // Course To change to get Different Output
        int floor1 = 1; // Floor Classroom is on
        String roomsd = "Room12"; // Room NR
        String roomcad = "Room15"; // Room NR
        
        if (course == "SD") {
            System.out.println("Welcome! Your class is in Room " + floor1 + ", " + roomsd);
        } 
        else if (course == "Cad") {
            System.out.println("Welcome! Your class is in Room " + floor1 + ", " + roomcad);
        }
        else {
            System.out.println("Please Go to Reception ");
        }
    }
}

