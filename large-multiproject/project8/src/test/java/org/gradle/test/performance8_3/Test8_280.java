package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_280 {
    private final Production8_280 production = new Production8_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}