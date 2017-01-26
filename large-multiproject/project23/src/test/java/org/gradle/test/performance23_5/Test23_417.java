package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_417 {
    private final Production23_417 production = new Production23_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}