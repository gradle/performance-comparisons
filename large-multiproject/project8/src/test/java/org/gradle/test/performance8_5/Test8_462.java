package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_462 {
    private final Production8_462 production = new Production8_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}