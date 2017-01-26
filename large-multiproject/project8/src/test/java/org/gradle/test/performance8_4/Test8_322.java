package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_322 {
    private final Production8_322 production = new Production8_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}