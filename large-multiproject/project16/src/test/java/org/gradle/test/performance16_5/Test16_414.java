package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_414 {
    private final Production16_414 production = new Production16_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}