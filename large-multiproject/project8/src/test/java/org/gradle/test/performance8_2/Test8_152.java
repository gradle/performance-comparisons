package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_152 {
    private final Production8_152 production = new Production8_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}