package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_103 {
    private final Production16_103 production = new Production16_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}