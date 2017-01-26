package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_339 {
    private final Production8_339 production = new Production8_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}