package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_304 {
    private final Production8_304 production = new Production8_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}