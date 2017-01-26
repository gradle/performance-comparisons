package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_184 {
    private final Production23_184 production = new Production23_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}