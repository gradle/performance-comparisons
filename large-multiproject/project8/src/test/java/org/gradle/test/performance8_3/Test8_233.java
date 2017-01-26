package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_233 {
    private final Production8_233 production = new Production8_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}