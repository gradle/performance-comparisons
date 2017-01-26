package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_283 {
    private final Production8_283 production = new Production8_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}