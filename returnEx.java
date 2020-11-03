class returnEx {
    public static void main(String[] args) {
        int result;

        // call the method and store returned value
        result = square(); 
        System.out.println("Squared value of 10 is: " + result);
    }

    public static int square() {
        // return statement
        return 10 * 10;
    }
}