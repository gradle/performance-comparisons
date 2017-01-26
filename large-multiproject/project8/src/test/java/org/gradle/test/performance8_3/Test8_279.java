package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_279 {
    private final Production8_279 production = new Production8_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}