package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_328 {
    private final Production8_328 production = new Production8_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}