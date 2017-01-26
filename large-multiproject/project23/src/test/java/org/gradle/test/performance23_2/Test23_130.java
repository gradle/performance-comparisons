package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_130 {
    private final Production23_130 production = new Production23_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}