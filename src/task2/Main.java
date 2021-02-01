package task2;

public class Main {
    public static void main(String[] args) {

        ClassRoom excelentPupul1 = new ClassRoom(new ExcelentPupil());
            System.out.println();
        ClassRoom excelentPupil2 = new ClassRoom(new ExcelentPupil());
            System.out.println();
        ClassRoom excelentPupil3 = new ClassRoom(new ExcelentPupil());
            System.out.println();
        ClassRoom excelentPupil4 = new ClassRoom(new ExcelentPupil());
            System.out.println();

        ClassRoom goodPupil1 = new ClassRoom(new GoodPupil());
            System.out.println();
        ClassRoom goodPupil2 = new ClassRoom(new GoodPupil());
            System.out.println();
        ClassRoom goodPupil3 = new ClassRoom(new GoodPupil());
            System.out.println();
        ClassRoom goodPupil4 = new ClassRoom(new GoodPupil());
            System.out.println();

        ClassRoom badPupil1 = new ClassRoom(new BadPupil());
            System.out.println();
        ClassRoom badPupil2 = new ClassRoom(new BadPupil());
            System.out.println();
        ClassRoom badPupil3 = new ClassRoom(new BadPupil());
            System.out.println();
        ClassRoom badPupil4 = new ClassRoom(new BadPupil());
            System.out.println();
    }
}
