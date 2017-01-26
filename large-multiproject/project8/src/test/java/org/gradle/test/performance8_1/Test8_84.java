package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_84 {
    private final Production8_84 production = new Production8_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}