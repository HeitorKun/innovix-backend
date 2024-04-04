package br.com.innovix.dto;

public class OrderDTO {
    private Long codOrder;
    private String companyName;
    private String sender;
    private String recipient;
    private Double shipCost;
    private String state;
    private Long codCustomer;

    // Getters e Setters

    public Long getCodCustomer() {
        return codCustomer;
    }

    public void setCodCustomer(Long codCustomer) {
        this.codCustomer = codCustomer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getShipCost() {
        return shipCost;
    }

    public void setShipCost(Double shipCost) {
        this.shipCost = shipCost;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getCodOrder() {
        return codOrder;
    }

    public void setCodOrder(Long codOrder) {
        this.codOrder = codOrder;
    }
}
