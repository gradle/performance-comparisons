package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_120 {
    private final Production8_120 production = new Production8_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}