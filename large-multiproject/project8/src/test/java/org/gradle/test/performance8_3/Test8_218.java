package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_218 {
    private final Production8_218 production = new Production8_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}