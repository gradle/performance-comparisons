package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_55 {
    private final Production8_55 production = new Production8_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}