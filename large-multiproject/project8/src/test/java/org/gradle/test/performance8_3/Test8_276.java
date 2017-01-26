package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_276 {
    private final Production8_276 production = new Production8_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}