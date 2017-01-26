package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_113 {
    private final Production8_113 production = new Production8_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}