package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_344 {
    private final Production8_344 production = new Production8_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}