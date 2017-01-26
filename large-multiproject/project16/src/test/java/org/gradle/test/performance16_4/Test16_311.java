package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_311 {
    private final Production16_311 production = new Production16_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}