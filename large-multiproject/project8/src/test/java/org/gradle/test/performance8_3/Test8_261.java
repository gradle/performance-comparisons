package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_261 {
    private final Production8_261 production = new Production8_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}