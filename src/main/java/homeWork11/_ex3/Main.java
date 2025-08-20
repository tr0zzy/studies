package homeWork11._ex3;

public class Main {
    public static void main(String[] args) {
        String[] data = {"10", "abc", "20"};

        for(int i = 0; i <= data.length; i++){
            try {
                int num = Integer.parseInt(data[i]);
                System.out.println("Число: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: " + data[i] +  " нельзя преобразовать в число");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: выход за пределы массива");
            } finally {
                System.out.println("Обработка массива завершена");
            }
          }
        }

    }

