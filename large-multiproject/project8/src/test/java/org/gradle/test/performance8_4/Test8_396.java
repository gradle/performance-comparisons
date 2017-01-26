package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_396 {
    private final Production8_396 production = new Production8_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}