package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_368 {
    private final Production8_368 production = new Production8_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}