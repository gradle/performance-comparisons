package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_197 {
    private final Production23_197 production = new Production23_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}