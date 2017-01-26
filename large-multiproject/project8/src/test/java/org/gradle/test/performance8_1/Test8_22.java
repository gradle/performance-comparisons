package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_22 {
    private final Production8_22 production = new Production8_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}