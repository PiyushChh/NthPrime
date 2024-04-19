class PrimeCalculator {

    int nth(int nth) {
        if(nth==0) throw new IllegalArgumentException();

        if(nth==1) return 2;

        int countOfPrimeNumbersFound=0;
        int startingPos=2;
        while(countOfPrimeNumbersFound<nth) {

            if (isPrime(startingPos)) {
                countOfPrimeNumbersFound++;
            }
            startingPos++;
        }
        return startingPos-1;
        }


    boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;

        if(n%2==0) return false;

        for (int i = 3; i * i <=n ; i+=2) {
            if(n%i==0) return false;

        }

        return true;
    }

}
