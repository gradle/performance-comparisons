package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_237 {
    private final Production8_237 production = new Production8_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}