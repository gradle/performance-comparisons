package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_409 {
    private final Production8_409 production = new Production8_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}