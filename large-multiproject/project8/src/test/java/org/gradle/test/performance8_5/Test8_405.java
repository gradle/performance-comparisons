package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_405 {
    private final Production8_405 production = new Production8_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}