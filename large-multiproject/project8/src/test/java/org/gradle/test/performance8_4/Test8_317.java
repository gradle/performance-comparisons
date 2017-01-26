package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_317 {
    private final Production8_317 production = new Production8_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}