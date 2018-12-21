package Praktikum9;

public class Truk {
    double muatan;
    double muatanmaks;
    
    public Truk(double beratmaks){
        this.muatanmaks= beratmaks;
    }
    
    public double getMuatan(){
        return muatan;
    }
    
    public double getMuatanMaks(){
        
        return muatanmaks;
        
    }
    
    public void tambahMuatan(double berat){
         if((berat+muatan)<=muatanmaks){
             muatan=muatan+berat;
         }
    }
  }