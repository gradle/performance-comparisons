package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_5 {
    private final Production8_5 production = new Production8_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}