package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_193 {
    private final Production8_193 production = new Production8_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}