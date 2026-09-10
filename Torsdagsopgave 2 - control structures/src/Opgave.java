public class Opgave {
}
/*
Opgave 1
double totalPrice =1500.0;
double discount = 20.0;
double totalSaved;

void main(){
if (totalPrice>1000);{
       totalSaved=totalPrice*(discount/100);
       totalPrice=totalPrice-totalSaved;
        }
        System.out.println("Your total price is "+totalPrice);


}

 */
/*
Opgave 3
 /*
int timeOfDay = 14;

void main() {
    if (timeOfDay >= 5 && timeOfDay <= 11) {
        System.out.println("Det er formiddag");
    }else if (timeOfDay >=12 && timeOfDay <=17) {
        System.out.println("Det er eftermiddag");
    }else if (timeOfDay >=18 && timeOfDay <=21) {
        System.out.println("Det er aften");
    }else{
        System.out.println("Det er nat");
    }

    }

 */
/*
Opgave 5
int totalPrice = 150;
boolean isMember = true;
int shippingCost = 50;

void main(){
    if (totalPrice>500 || (isMember &&totalPrice>200))
    {
        System.out.println("Your total is " + totalPrice + " kr");
    }else{
        System.out.println("Your total is "+(totalPrice+shippingCost)+" kr");
    }
}
 */
/*
Opgave 8


int age = 22;
boolean hasAccidents = false;
int accidents = 0;
boolean riskZone =false;
int basePremium = 5000;
int highRiskPremium = 2000;
int premiumTotal;

void main(){
if ((age<25||age>70)||(hasAccidents&&accidents>2)<||riskZone) {
    premiumTotal = basePremium+highRiskPremium;
}else{
    premiumTotal =basePremium;
}

}
 */
/*
opgave 10

String menuItem = "pizza";
int quantity = 2;
int totalPrice=0;

void main(){
    switch (menuItem) {
        case "burger":
            totalPrice = 89 * quantity;
break;
        case "pizza":
            totalPrice = 95 *quantity;
            break;
        case "salad":
            totalPrice = 65*quantity;
            break;
        case "pasta":
            totalPrice = 79*quantity;
            break;
        case "steak":
            totalPrice = 145*2;
            break;


    }
    System.out.println(totalPrice);
}
 */
/*
Opgave 15

double savings = 0.0;
double moneyDepositedMonthly = 500.0;
double maxMoney = 10000.0;
int monthAmount=0;

void main(){
while (savings<maxMoney){
    savings+=moneyDepositedMonthly;
    monthAmount++;

    }
    System.out.println(monthAmount);
}
 */
/*
Opgave 20
int monthsToSave=12;
int amountSaved;

void main(){

for (int i=0;i<monthsToSave;i++){
    amountSaved+=1000;
    System.out.println(amountSaved);
}
}
*/
/*
opgave 24
int[] scores = {85,92,78,88,95,73,90};
int highestGrade=0;
int lowestGrade =scores[0];
int amountOver80;


void main(){
//højeste
for(int i=0;i<scores.length;i++){
    if(highestGrade<scores[i]){
        highestGrade=scores[i];
    }
    }
    System.out.println(highestGrade);
//laveste
    for(int i=0;i<scores.length;i++){
        if(lowestGrade>scores[i]){
            lowestGrade=scores[i];
        }
    }
    System.out.println(lowestGrade);
//over 80
    for(int i=0;i<scores.length;i++){
        if (scores[i]>80){
        amountOver80+=1;
    }
}
    System.out.println(amountOver80);
//gennemsnit
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
        sum += scores[i];
    }
    double average = (double) sum / scores.length;
}
*/
/*
opgave 27

void main(){

double[] prices = {299.0,149.0,899.0,49.0};
double total = 0.0;

for (double price:prices){
    total+=price;
}
    System.out.println(total);
}
 */