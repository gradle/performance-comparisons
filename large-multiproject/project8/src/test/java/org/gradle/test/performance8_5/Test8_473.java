package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_473 {
    private final Production8_473 production = new Production8_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}