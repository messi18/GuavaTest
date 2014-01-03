import com.google.common.base.Objects;

/**
 * Created by malance on 14-1-4.
 */
public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString(){
        Objects.ToStringHelper toStringHelper = Objects.toStringHelper(User.class);
        toStringHelper.add("name",this.name);
        toStringHelper.add("password",this.password);

        return toStringHelper.toString();
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(this.name,this.password);
    }
}
