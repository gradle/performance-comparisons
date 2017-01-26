package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_483 {
    private final Production8_483 production = new Production8_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}