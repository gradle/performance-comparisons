package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_118 {
    private final Production16_118 production = new Production16_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}