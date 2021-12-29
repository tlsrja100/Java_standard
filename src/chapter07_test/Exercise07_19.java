package chapter07_test;

public class Exercise07_19 {
    // [7-17] 다음은 물건을 구입하는 사람을 정의한 Buyer클래스이다 이 클래스는 멤버변수 로 돈(money)과 장바구니(cart)를 가지고 있다
    // 제품을 구입하는 기능의. buy메서드와 장 바구니에 구입한 물건을 추가하는 add메서드 구입한 물건의 목록과 사용금액 그리고
    // 남은 금액을 출력하는 summary메서드를 완성하시오.
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tvv());
        b.buy(new Computer());
        b.buy(new Tvv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Productt[] cart = new Productt[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0;    // Product배열 cart에 사용될 index

    void buy(Productt p) {
    /*
    (1)	아래의 로직에 맞게 코드를 작성하시오.
    1.1	가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
    1.2	가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
    1.3	장바구니에 구입한 물건을 담는다.(add메서드 호출)
    */
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p.toString() + "을/를 살수 없습니다.");
            return;
        }
        if (money > p.price) {
            money -= p.price;
            add(p);
        }
    }

    void add(Productt p) {
    /*
    (2)	아래의 로직에 맞게 코드를 작성하시오.
    1.1 i의 값이 장바구니의 크기보다 같거나 크면 1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
    1.1.2	기존의 장바구니의 내용을 새로운 배열에 복사한다.
    1.1.3	새로운 장바구니와 기존의 장바구니를 바꾼다.
    1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
    */
        if (i >= cart.length) {
            Productt[] tmp = new Productt[cart.length *2];
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            cart = tmp;
        }
        cart[i++] = p;
    }

    void summary() {
        String itemlList = "";
        int sum = 0;
    /*
    (3)	아래의 로직에 맞게 코드를 작성하시오.
    1.1	장바구니에 담긴 물건들의 목록을 만들어 출력한다.
    1.2	장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
    1.3	물건을 사고 남은 금액(money)를 출력한다.
    */
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            itemlList += cart[i] + ",";
            sum += cart[i].price;
        }
        System.out.println("구입한 물건 : " + itemlList);
        System.out.println("사용한 금액 : " + sum);
        System.out.println("남은 금액 : " + money);
    }
}

class Productt {
    int price;    // 제품의 가격

    Productt(int price) {
        this.price = price;
    }
}

class Tvv extends Productt {
    Tvv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Productt {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Productt {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}
