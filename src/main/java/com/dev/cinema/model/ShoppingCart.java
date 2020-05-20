package com.dev.cinema.model;

import java.time.LocalDateTime;
import java.util.List;

public class ShoppingCart {
    private Long id;
    private List<Ticket> tickets;
    private LocalDateTime orderDate;
    private User user;

    public ShoppingCart(Long id, List<Ticket> tickets, LocalDateTime orderDate, User user) {
        this.id = id;
        this.tickets = tickets;
        this.orderDate = orderDate;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}