package com.company;


public class Cast {
    public String actor;
    private String role;

    public Cast(String actor, String role) {
        this.actor = actor;
        this.role = role;
    }

    public Cast() {

    }

    public String getActor() {
        return this.actor;
    }

    public String getRole() {
        return this.role;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Cast)) return false;
        final Cast other = (Cast) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$actor = this.getActor();
        final Object other$actor = other.getActor();
        if (this$actor == null ? other$actor != null : !this$actor.equals(other$actor)) return false;
        final Object this$role = this.getRole();
        final Object other$role = other.getRole();
        if (this$role == null ? other$role != null : !this$role.equals(other$role)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Cast;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $actor = this.getActor();
        result = result * PRIME + ($actor == null ? 43 : $actor.hashCode());
        final Object $role = this.getRole();
        result = result * PRIME + ($role == null ? 43 : $role.hashCode());
        return result;
    }

    public String toString() {
        return "Cast(actor=" + this.getActor() + ", role=" + this.getRole() + ")";
    }
}
