package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_131 {
    private final Production8_131 production = new Production8_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}