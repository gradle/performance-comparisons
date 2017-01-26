package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_292 {
    private final Production23_292 production = new Production23_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}