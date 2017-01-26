package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_312 {
    private final Production8_312 production = new Production8_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}