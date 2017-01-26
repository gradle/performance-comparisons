package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_436 {
    private final Production8_436 production = new Production8_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}