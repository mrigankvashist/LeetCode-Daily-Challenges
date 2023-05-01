//Approach 1 :-

// import java.util.Arrays;

// class Solution {
//     public double average(int[] salary) {
//         Arrays.sort(salary);
//         double sum = 0;
//         for(int i =1;i<salary.length - 1;i++){
//             sum += salary[i];
//         }
//         double avg = sum / (salary.length - 2);
//         return avg;
//     }
// }

//Approach 2 :-

class Solution {
    public double average(int[] salary) {
        int min = 1000000;
        int max = 1000;
        double sum = 0;
        for(int i =0;i<salary.length;i++){
            if(salary[i] < min){
                min = salary[i];
            }
            if(salary[i] > max){
                max = salary[i];
            }
        }
        
        for(int i=0;i<salary.length;i++){
            sum += salary[i];
        }
        sum = sum - min - max;
        double avg = sum / (salary.length - 2);
        return avg;
    }
}