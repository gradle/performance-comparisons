package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_7 {
    private final Production8_7 production = new Production8_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}