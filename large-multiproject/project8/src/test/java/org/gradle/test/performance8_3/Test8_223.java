package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_223 {
    private final Production8_223 production = new Production8_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}