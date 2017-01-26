package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_259 {
    private final Production8_259 production = new Production8_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}