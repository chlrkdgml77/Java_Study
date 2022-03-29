public class Single_01 {
/*
싱글톤 패턴_01

- 목적
  -> 인스턴스를 오직 한개만 제공하는 클래스
     (-> 인스턴스가 여러개라는 것은?..new를 통해 객체 생성을 계속한다는것)
  -> 그렇게 만들어진 하나의 인스턴스에 다양하게 접근하는 방법

- Why?
  -> ex) 게임 설정은 하나만 있어야한다. 만약 a 설정에서는 마우스를 이용해서 공격하는걸로 지정하였는데
         b 설정에서는 키보드를 사용해서 공격하는걸로 지정하면 곤란하기때문

- 그렇다면 싱글톤패턴 즉, 인스턴스를 오직 하나만 제공하는 클래스를 만들기 위해서는?
  -> new를 사용하면 안됨!!
    -> new를 사용 못하게 하려면?..클래스 생성자를 private로 생성

- 이렇게 제한을 걸면 어떻게 다양하게 접근?
  -> static 메서드를 통해서
  (ex, private static Settings instance;
       public static Settings getInstance() {
            if (instance == null) {
                instance = new Settings();
            }
            return instance;
        }
    )
    -> 이러면 인스턴스를 계속 호출해도 같은 인스턴스로 인식

- 문제점?
  -> 멀티쓰레드(동시접근)에 안전하지 않다.
  Why? -> 하나의 쓰레드가 if문에 접근해서 하나의 인스턴스를 생성하기 전에
          비슷한 시기에 다른 쓰레드가 접근하면 인스턴스가 두개 이상 생성되기 때문

  그렇다면 이 문제를 해결할 방법은?
    1. getInstance 메서드에 sychronized 키워드 붙여서 한번에 하나의 쓰레드만 들어오도록 제한..
    2. 애초에 private static Settings instance; 이 선언을
       private static final Settings INSTANCE = new Settings(); 로 이른 초기화를 해버린다.
       (이러면 getInstance에서 if문은 없어도된다.)
    3. sychronized 키워드를 if문 안에 넣어 두번 체크한다
       (ex, private static "volatile" Settings instance;
        public static Settings getInstance() {
            if (instance == null) {
                sychronized (Settings.class) {
                    if (instance == null) {
                        instanc = new Settings(); )
    **** (권장)4.
    (ex, private Settings() {}
         private static class SettingsHolder {
            private static final Settings INSTANCE = new Settings();
         }
         public static Settings getInstance() {
            return SettingsHolder.INSTANCE;
         }
    )
    **** (권장)5.
    public "enum" Settings {
        INSTANCE;
    }
    -> 단, enum을 사용시 단점은 사용하는 순간 인스턴스가 무조건 생성되버림
 */
}
