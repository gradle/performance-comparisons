package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_120 {
    private final Production16_120 production = new Production16_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}