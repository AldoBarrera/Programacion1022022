/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment3;

/**
 *
 * @author Gilberto
 */
public class Numbers {
    int[] numbers;
    int[] numbers2;
    int numElem2 = 0;
    int numElem = 0;
    public Numbers(int length) {
        this.numbers = new int[length];
        this.numbers2 = new int[length];
    }
    
    void fillNumbers(int min, int max) {
        while(numElem < this.numbers.length) {
            this.fillNumber(min, max);
        }
    }
    
    void fillNumber(int min, int max) {
        int ramdomNuumber = this.generateRandoNumber(min, max);
        if (!this.isRepeatedNumber(ramdomNuumber)) {
            this.numbers[numElem] = ramdomNuumber;
            numElem++;
        }
    }
    
    void fillNumbers2() {
        for(int number : numbers) {
            if (number % 2 ==0 && number > 25){
                this.numbers2[numElem2] = number;
                numElem2++;
            }
        }
    }
    
    boolean isRepeatedNumber(int numberEntry) {
        for (int number : numbers) {
            if(number == numberEntry) {
                return true;
            }
        }
        return false;
    }
    
    public int generateRandoNumber(int min, int max) {
        return (int)Math.floor(Math.random() * (max-min+1) + (min));
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int number : numbers) {
            sb.append(number);
            sb.append("\n");
        }
        sb.append("Array Numero 2");
        sb.append("\n");
        for(int number : numbers2) {
            sb.append(number);
            sb.append("\n");
        }
        return sb.toString();
    }
}
