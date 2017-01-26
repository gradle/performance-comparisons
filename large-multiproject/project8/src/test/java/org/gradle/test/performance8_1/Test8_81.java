package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_81 {
    private final Production8_81 production = new Production8_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}