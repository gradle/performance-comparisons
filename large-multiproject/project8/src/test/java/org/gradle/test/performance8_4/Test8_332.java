package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_332 {
    private final Production8_332 production = new Production8_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}