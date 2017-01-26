package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_261 {
    private final Production16_261 production = new Production16_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}