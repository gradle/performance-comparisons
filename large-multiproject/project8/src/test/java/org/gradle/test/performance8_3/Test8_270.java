package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_270 {
    private final Production8_270 production = new Production8_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}