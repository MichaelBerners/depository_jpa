package ru.belonogov.depository_jpa.models;

//пермишн для роли (спринг секьюрити)
public enum Permission {

    USER_READ("user:read"), USER_WRITE("user:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
