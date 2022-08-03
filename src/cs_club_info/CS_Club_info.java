/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_club_info;

import java.util.Scanner;

/**
 *
 * @author Kareem_29
 */
public class CS_Club_info {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       String name[]= new String[10] ; 
       String department[]= new String[10] ; 
       String position[]= new String[10] ; 
       int ID[]= new int[10] ; 
       
     int option , option1 , option2, option3 ; 
     int i=0; 
     
     Scanner Input = new Scanner(System.in) ; 
     Student[] Z =new Student[10];
     
     do 
     {
         System.out.print("\n                 -{     Welcome to the Club    }- \n\n\n" );            
            System.out.print("Choice one of them :\n" );
            System.out.print("[1] Add New Member.\n" );
            System.out.print("[2] Viw Members Details.\n" );
            System.out.print("[3] Search For a Member.\n" );
            System.out.print("[4] Update Member Details.\n" );
            System.out.print("[5] Exit.\n" );
            System.out.print("Enter your choice: " ); 
            
            option=Input.nextInt();
         
         switch(option)
            {
                case 1:
                {
                    if( i<= 9)
                    {
                       System.out.print("Enter the student name : ");
                        name[i]=Input.next();
                        
                        System.out.print("Enter the student department : ");
                        department[i]=Input.next();
                        
                        System.out.print("Enter the student position: ");
                        position[i]=Input.next();
                        
                        ID[i]=1000+i+1;
                    
                    }
                    else
                    {
                        System.out.println("\n *YOU CAN'T ADD MORE THAN 10 MEMBER.* \n");

                    }                    
                    i++;
                    
                    break;
                }
                 case 2:
                {
                   if(i == 0)
                   {
                       System.out.println(" *THERE ARE NOT INFORMATION ABOUT MEMBERS.* \n\n");
                   }
                   else if (i!= 0)
                   {
                       System.out.println("\n-{      MEMBERS INFORMATION     }- \n");                           
                        
                       for (int count =0 ; count<i ; count++) 
                       {                                               
                           System.out.println("ID: "+ID[count]+" \n "+"Name: "+name[count]+" \n "+"Department: "+department[count]+" \n "+"Position: "+position[count]+" \n ");

                       }   
                   }
                   
                    break;
                }
                case 3:
                {
                  if(i == 0)
                   {
                       System.out.println(" *THERE ARE NOT INFORMATION ABOUT MEMBERS.* \n\n");
                   }
                   else if (i!= 0)
                   {
                       System.out.println("Enter the student ID: ");
                       option1=Input.nextInt();
                       
                       for(int count=0 ; count<i ;count++)
                       {
                           if (ID[count]!= option1)
				{                       
                                    System.out.println("\n This student cann't be found in the IT club.\n");
				}
                           else if (ID[count] == option1)
                           {
                           System.out.println("\n -{     MEMBERS INFORMATION     }-\n\n");                       
                           System.out.println("ID: \t\t Name: \t\t Department: \t\t Position: \n"); 
                           System.out.println(ID[count]+" \t\t "+name[count]+" \t\t\t "+department[count]+" \t\t\t "+position[count]+" \n ");
                           }
                       }
                   }
                  
                    break;
                }
                    case 4:
                {
                 if(i== 0)
                   {
                       System.out.println(" *THERE ARE NOT INFORMATION ABOUT  MEMBERS.* \n\n");
                   }
                   else if (i!= 0)
                   {
                       System.out.println("Enter the student ID: ");
                       option2=Input.nextInt();
                       
                       for(int count=0; count<i ; count++)
                       {
                           if (ID[count]!= option2)
				{                       
                                    System.out.println("\n This student cann't be found in the IT club.\n");
				}
                       }
                       for (int count =0 ; count<i ; count++) 
                       {
                           if (ID[count] == option2)
                           {
                               System.out.print(" Choice one to update :\n" );
                               System.out.print("[1] Name.\n" );
                               System.out.print("[2] Department.\n" );
                               System.out.print("[3] Position.\n" );
                               System.out.print("Enter your choice: \n" );
                               
                               option3=Input.nextInt();
                               
                               
                               switch (option3)
                               {
                                   case 1:
                                   {
                                       System.out.println("Old name is : "+name[count]);
                                       System.out.println("Enter student new name : ");
                                       name[count]=Input.next();
                                       System.out.println("New name is : "+name[count]);
                                       break;
                                   }
              case 2:
                                   {
                                       System.out.println("Old depertment is : "+department[count]);
                                       System.out.println("Enter student new name : ");
                                       department[count]=Input.next();
                                       System.out.println("New depertment is : "+department[count]);
                                       break;
                                   }
                                   
                                   case 3:
                                   {
                                       System.out.println("Old position is: "+position[count]);
                                       System.out.println("Enter student new name : ");
                                       position[count]=Input.next();
                                       System.out.println("New position is : "+position[count]);
                                       break;
                                   }
                                   default:
                                   {
                                       System.out.println("Error input !!!\n");
                                   }
                               }
                           }

                       }   
                   }
                    break;
                }
                case 5:
                {
                    break;
                }
                    
                default:
                {
                    System.out.println("Error input !!!\n");
                }
                
                
            }

        
        }while(option!=5);         
     }
        
       
    }
    
    

