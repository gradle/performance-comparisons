package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_249 {
    private final Production8_249 production = new Production8_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}