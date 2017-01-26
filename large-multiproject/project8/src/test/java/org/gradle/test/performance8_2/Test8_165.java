package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_165 {
    private final Production8_165 production = new Production8_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}