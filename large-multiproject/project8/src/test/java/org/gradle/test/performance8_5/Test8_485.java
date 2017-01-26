package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_485 {
    private final Production8_485 production = new Production8_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}