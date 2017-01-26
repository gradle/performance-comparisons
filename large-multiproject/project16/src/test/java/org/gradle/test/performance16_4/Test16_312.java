package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_312 {
    private final Production16_312 production = new Production16_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}