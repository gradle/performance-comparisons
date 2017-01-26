package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_321 {
    private final Production8_321 production = new Production8_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}