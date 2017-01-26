package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_52 {
    private final Production8_52 production = new Production8_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}