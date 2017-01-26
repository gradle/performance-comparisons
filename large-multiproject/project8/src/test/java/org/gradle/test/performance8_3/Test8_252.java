package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_252 {
    private final Production8_252 production = new Production8_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}