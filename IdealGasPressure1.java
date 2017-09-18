/*************************************************************************
 //Paula Stutzman
 //March 3, 2016
 //calculate Ideal Gas Pressure
 //using methods
 **************************************************************************/
 import java.text.DecimalFormat;
 import javax.swing.*;


 public class IdealGasPressure1
 {

 public static double userTemperature()//method used to get
 //user input for volume

 {

 double temperature = 0.0;
 String temporary = new String();
 boolean valid = false; //declared variables

 while (valid == false)//loop to stop incorrect user input
 {
 try
 {


 temporary=JOptionPane.showInputDialog(null,
 "Enter the temperature ->");
 temperature = Double.parseDouble(temporary);
 valid = true;
 if (temperature <=0)
 {
 JOptionPane.showMessageDialog(null,
 "Enter a non-zero, a positive number!");
 valid = false;
 }//end valid input
 }//end of try block
 catch (NumberFormatException e)
 {
 JOptionPane.showMessageDialog(null,
 "DO NOT ENTER LETTERS\n"+
 "When asked for a temperature you must enter a number");
 }//end of catch numberFormatException
 catch (Exception x)
{
 JOptionPane.showMessageDialog(null,
 "run-time error has occured.\n"+
 "Error message was "+x);
 }//end of catch Exception
 }//end loop

 return temperature;
 }//end of userTemperature - where user enters temperature to be used later


 public static double userVolume()//method used to get user input for volume
 {
 double volume = 0.0;
 String temporary = new String();
 boolean valid = false;//declared variables

 while (valid == false)//loop to stop incorrect user input
 {
 try
 {
 temporary=JOptionPane.showInputDialog(null,
 "Enter the volume ->");
 volume = Double.parseDouble(temporary);
 valid = true;
 if (volume <=0)
 {
 JOptionPane.showMessageDialog(null,
 "Enter a non-zero, a positive number!");
 valid = false;
 }//end valid input
 }//end of try block
 catch (NumberFormatException e)
 {
 JOptionPane.showMessageDialog(null,
 "DO NOT ENTER LETTERS\n"+
 "When asked for a volume you must enter a number");
 }//end of catch numberFormatException
 catch (Exception x)
 {
 JOptionPane.showMessageDialog(null,
 "run-time error has occured.\n"+
 "Error message was "+x);
 }//end of catch Exception
 }//end loop
return volume;
 }//end of userVolume - where user enters temperature to be used later


 public static double computeIdealGasPressure(double temperature, double volume)
 //method used to calculate Ideal Gas Pressure
 {

 final double N = 1.0;
 final double R = 0.7302;
 double answer = 0.0; //declared variables

 answer = ((N * R * (temperature + 460.0))/ volume);
 return answer;
 }//end of gasPressureCalculation - where users entered data is calculated




 public static void main (String [] args)//main method
 {
 String temporary = new String();
 char choice = ' ';
 String message = "Paula Stutzman";//declared variables
 JOptionPane.showMessageDialog(null,"Paula Stutzman");

 do{ //loop used to terminate program or continue program
 DecimalFormat mine = new DecimalFormat("#,##0.00");
 double temperature = userTemperature();
 double volume = userVolume();
 double answer = computeIdealGasPressure(temperature, volume);//declared variables

 JOptionPane.showMessageDialog(null, "The Ideal Gas pressure is "
 + mine.format(answer) + " atmospheres");
 temporary = JOptionPane.showInputDialog(null,
 "Do you wish to process more data? (Y/N) ");
 choice = temporary.charAt(0);
 }while ((choice == 'Y') || (choice =='y'));//end of loop


 }//end of main method
 }//end of program
