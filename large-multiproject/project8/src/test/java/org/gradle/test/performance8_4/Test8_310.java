package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_310 {
    private final Production8_310 production = new Production8_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}