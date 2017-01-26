package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_448 {
    private final Production8_448 production = new Production8_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}