package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_479 {
    private final Production8_479 production = new Production8_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}