class Check {
        public static void main(String[] args) {
        String college = "MIT";
        String branch = "CSE";
        int marks = 55;

        if (college.equals( "MIT")) {
            if (branch.equals("CSE")) {
                if (marks > 60) {
                    System.out.println("Eligible for TCS placement");
                } else {
                    System.out.println("Not eligible for TCS placement");
                }
            } else {
                System.out.println("Branch not eligible");
            }
        } else {
            System.out.println("College not eligible");
        }
    }
}

