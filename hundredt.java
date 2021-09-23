/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author howellx
 */
public class hundredt{
        private int salary;
        private String fir_name; private String last_name;
        private String position;
        
        
        hundredt(){
            
        }
        hundredt(String fir, String last, int salary, String pos){
            fir_name = fir;
            last_name =last;
            this.salary=salary;
            position = pos;
        }
        
        int getSalary(){
            return this.salary;
        }
        void setSalary(int salary){
            this.salary = salary;
        }
        
        String getPostion(){
            return this.position;
        }
        void setPostion(String position){
            this.position = position;
        }
        
        String getLastN(){
            return this.last_name;
        }
        void setLastN(String last_name){
            this.last_name = last_name;
        }
        
        String getFirstN(){
            return this.fir_name;
        }
       void setFirstN(String fir_name){
            this.fir_name = fir_name;
        }
       
       String display(){
        return String.format("Name: %s %s Position: %s Salary: $%d \t", this.getFirstN(),this.getLastN(),this.getPostion(),this.getSalary());
       }
        
    
                
       }
    
    

