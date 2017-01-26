package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_130 {
    private final Production5_130 production = new Production5_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}