package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_370 {
    private final Production8_370 production = new Production8_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}