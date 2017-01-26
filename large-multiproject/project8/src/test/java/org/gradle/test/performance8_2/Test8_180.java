package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_180 {
    private final Production8_180 production = new Production8_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}