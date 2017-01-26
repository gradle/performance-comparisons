package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_273 {
    private final Production8_273 production = new Production8_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}