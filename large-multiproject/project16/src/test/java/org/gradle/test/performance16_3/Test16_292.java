package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_292 {
    private final Production16_292 production = new Production16_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}