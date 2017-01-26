package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_316 {
    private final Production8_316 production = new Production8_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}