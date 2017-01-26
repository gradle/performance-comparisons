package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_284 {
    private final Production8_284 production = new Production8_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}