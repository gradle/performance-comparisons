package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_129 {
    private final Production16_129 production = new Production16_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}