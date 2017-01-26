package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_400 {
    private final Production8_400 production = new Production8_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}