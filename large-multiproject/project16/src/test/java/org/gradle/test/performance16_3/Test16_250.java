package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_250 {
    private final Production16_250 production = new Production16_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}