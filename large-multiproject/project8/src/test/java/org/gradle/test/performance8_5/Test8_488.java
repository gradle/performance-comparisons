package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_488 {
    private final Production8_488 production = new Production8_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}