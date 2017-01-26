package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_340 {
    private final Production8_340 production = new Production8_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}