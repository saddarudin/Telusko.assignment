public class triangleOfAlphabet {
    public static void main(String[] args) {
        for (int i = 65; i <91 ; i++) {
            for(int j=65;j<=i;j++) System.out.print((char)j+" ");
            System.out.println();
        }
    }
}
