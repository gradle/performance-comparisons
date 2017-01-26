package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_410 {
    private final Production8_410 production = new Production8_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}