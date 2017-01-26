package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_414 {
    private final Production5_414 production = new Production5_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}