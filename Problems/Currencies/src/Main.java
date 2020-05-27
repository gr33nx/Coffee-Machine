public enum Currency {

    USD("United States dollar"),
    EUR("Euro"),
    GBP("Pound sterling"),
    RUB("Russian ruble"),
    UAH("Ukrainian hryvnia"),
    KZT("Kazakhstani tenge"),
    CAD("Canadian dollar"),
    JPY("Japanese yen"),
    CNY("Chinese yuan");

    String code;

    Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return  code;
    }
}