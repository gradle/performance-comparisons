package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_486 {
    private final Production8_486 production = new Production8_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}