
package com.iqmsoft.payara.micro;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Data;


@Data
@Named
@SessionScoped
public class User implements Serializable{
   String name;
   int age;
}
