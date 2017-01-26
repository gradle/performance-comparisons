package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_110 {
    private final Production5_110 production = new Production5_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}