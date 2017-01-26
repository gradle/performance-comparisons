package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_469 {
    private final Production8_469 production = new Production8_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}