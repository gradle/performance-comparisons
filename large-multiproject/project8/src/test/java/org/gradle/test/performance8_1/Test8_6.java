package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_6 {
    private final Production8_6 production = new Production8_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}