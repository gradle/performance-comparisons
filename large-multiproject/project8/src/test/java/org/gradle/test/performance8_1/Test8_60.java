package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_60 {
    private final Production8_60 production = new Production8_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}