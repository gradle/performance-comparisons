package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_472 {
    private final Production8_472 production = new Production8_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}