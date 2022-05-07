package com.noirix.innerclasses;

import com.noirix.domain.AnotherOneInterface;
import com.noirix.domain.Cat;

public class Thing {
    /*We are planning to realise some complicated logic*/
    public void process() {

        class UniqueLogic extends Cat implements AnotherOneInterface {
            private String firstName;

            private long id;

            public UniqueLogic() {
            }

            public UniqueLogic(String firstName, long id) {
                this.firstName = firstName;
                this.id = id;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            @Override
            public String getSomeString() {
                return null;
            }
        }

        class UniqueSecond extends UniqueLogic {
        }

        UniqueLogic uniqueLogic = new UniqueLogic();
        UniqueSecond uniqueSecond = new UniqueSecond();
    }

    public void process2() {
    }
}
