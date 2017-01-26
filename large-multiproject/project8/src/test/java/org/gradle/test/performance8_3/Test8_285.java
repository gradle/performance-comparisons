package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_285 {
    private final Production8_285 production = new Production8_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}