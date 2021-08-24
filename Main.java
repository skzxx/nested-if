public class Main {
  public static void main (String [] args) {
    /*Nested if
    if(Kondisi 1) {
      if(Kondisi 2) {
        Statement aksi
      } else {
        Aksi default 2
      }
    } else {
      Aksi default 1
    }
    
    */
    int OperatorNumerik_A = 5;
    int OperatorNumerik_B = 10;
    if(OperatorNumerik_A == 5 ) {
      if(OperatorNumerik_B == 10) {
        System.out.print("Kondisi ketika Integer A = 5, Integer B = 10; maka aksi ini akan dijalani ketika kedua variabel benar");
      } else {
        System.out.print("Aksi yang dijalani ketika variabel a = 5 namun b bukan 10");
      }
    } else {
      System.out.print("Aksi jika A salah atau Kedua variabel salah");
    }
    /*
    contoh kasus
    (1) Ketika kedua variabel a dan b benar aksi statement akan dijalankan
    (2) Ketika variabel a benar namun b salah maka akan ditampilkan statement default 2.
    (3) Ketika kedua kondisi salah (variabel a dan b ) maka akan dijalankan statement default 1.
    (4) Ketika b benar namun a salah maka akan masuk ke statement default 1.
    
    */
  }
}