public class App {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("map.txt", 15, 15);

        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), 
            fileReader.getStartPositionRow(),
            fileReader.getStartPositionCol());
        mazeSolver.findWayOut();
    }
}