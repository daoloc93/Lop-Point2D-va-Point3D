import java.util.Arrays;

public class Point3D extends Point2D {
    float z = 0f;
    float xyz[] = {x, y, z};

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXyz() {
        return xyz;
    }

    public void setXyz(float[] xyz) {
        this.xyz = xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", xyz=" + Arrays.toString(xyz) +
                '}';
    }
}
