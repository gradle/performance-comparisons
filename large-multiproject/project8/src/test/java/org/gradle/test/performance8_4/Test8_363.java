package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_363 {
    private final Production8_363 production = new Production8_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}