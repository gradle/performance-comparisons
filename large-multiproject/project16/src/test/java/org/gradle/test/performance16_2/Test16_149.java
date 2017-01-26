package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_149 {
    private final Production16_149 production = new Production16_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}