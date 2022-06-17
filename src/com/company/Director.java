package com.company;

import java.util.Comparator;

public class Director {
    private String directorName;
    private String directorLatsName;
    public Director(){

    }

    public Director(String directorName, String directorLatsName) {
        this.directorName = directorName;
        this.directorLatsName = directorLatsName;
    }

    public String getDirectorName() {
        return this.directorName;
    }

    public String getDirectorLatsName() {
        return this.directorLatsName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public void setDirectorLatsName(String directorLatsName) {
        this.directorLatsName = directorLatsName;
    }



    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Director)) return false;
        final Director other = (Director) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$directorName = this.getDirectorName();
        final Object other$directorName = other.getDirectorName();
        if (this$directorName == null ? other$directorName != null : !this$directorName.equals(other$directorName))
            return false;
        final Object this$directorLatsName = this.getDirectorLatsName();
        final Object other$directorLatsName = other.getDirectorLatsName();
        if (this$directorLatsName == null ? other$directorLatsName != null : !this$directorLatsName.equals(other$directorLatsName))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Director;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $directorName = this.getDirectorName();
        result = result * PRIME + ($directorName == null ? 43 : $directorName.hashCode());
        final Object $directorLatsName = this.getDirectorLatsName();
        result = result * PRIME + ($directorLatsName == null ? 43 : $directorLatsName.hashCode());
        return result;
    }

    public String toString() {
        return "Director(directorName=" + this.getDirectorName() + ", directorLatsName=" + this.getDirectorLatsName() + ")";
    }
}
