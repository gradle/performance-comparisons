package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_265 {
    private final Production8_265 production = new Production8_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}