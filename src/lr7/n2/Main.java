package lr7.n2;

public class Main {
    public static void main(String[] args) {
        SuperClassN2 sc = new SuperClassN2("Суперкласс");
        System.out.println("Суперкласс: " + sc.getSuperstringLength());
        sc.setValue();
        System.out.println("Суперкласс: " + sc.getSuperstringLength());
        sc.setValue("Секрет");
        System.out.println("Суперкласс: " + sc.getSuperstringLength());

        SubClassN2 subc = new SubClassN2(12, "Субкласс");
        System.out.println("Субкласс: " + subc.subint + " / " + subc.getSuperstringLength());
        subc.setValue();
        System.out.println("Субкласс: " + subc.subint + " / " + subc.getSuperstringLength());
        subc.setValue(1111);
        System.out.println("Субкласс: " + subc.subint + " / " + subc.getSuperstringLength());
        subc.setValue("Привет");
        System.out.println("Субкласс: " + subc.subint + " / " + subc.getSuperstringLength());
        subc.setValue(1234, "Пока");
        System.out.println("Субкласс: " + subc.subint + " / " + subc.getSuperstringLength());
    }
}

//Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//базовом классе должен быть метод для присваивания значения полю: без параметров и с
//одним текстовым параметром. Объект суперкласса создается передачей одного текстового
//аргумента конструктору. Доступное только для чтения свойство результатом возвращает
//длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
//дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
//для присваивания значений полям (используется переопределение и перегрузка метода из
//суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//текстовым и целочисленным параметром. У конструктора подкласса два параметра
//(целочисленный и текстовый).