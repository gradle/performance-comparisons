package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_65 {
    private final Production8_65 production = new Production8_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}