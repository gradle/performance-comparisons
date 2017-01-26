package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_446 {
    private final Production8_446 production = new Production8_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}