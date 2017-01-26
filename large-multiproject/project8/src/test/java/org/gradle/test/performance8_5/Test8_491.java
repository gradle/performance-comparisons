package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_491 {
    private final Production8_491 production = new Production8_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}