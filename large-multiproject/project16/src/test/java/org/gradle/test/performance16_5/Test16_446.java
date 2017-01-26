package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_446 {
    private final Production16_446 production = new Production16_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}