package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_449 {
    private final Production23_449 production = new Production23_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}