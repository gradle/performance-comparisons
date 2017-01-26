package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_250 {
    private final Production8_250 production = new Production8_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}