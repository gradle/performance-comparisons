package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_389 {
    private final Production8_389 production = new Production8_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}