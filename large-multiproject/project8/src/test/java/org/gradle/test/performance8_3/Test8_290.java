package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_290 {
    private final Production8_290 production = new Production8_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}