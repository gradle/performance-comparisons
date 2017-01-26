package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_141 {
    private final Production8_141 production = new Production8_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}