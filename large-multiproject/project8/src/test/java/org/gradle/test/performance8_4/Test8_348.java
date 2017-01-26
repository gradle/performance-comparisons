package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_348 {
    private final Production8_348 production = new Production8_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}