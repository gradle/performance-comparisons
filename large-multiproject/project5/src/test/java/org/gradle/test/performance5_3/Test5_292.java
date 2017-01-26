package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_292 {
    private final Production5_292 production = new Production5_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}