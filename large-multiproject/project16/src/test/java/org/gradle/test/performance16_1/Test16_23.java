package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_23 {
    private final Production16_23 production = new Production16_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}