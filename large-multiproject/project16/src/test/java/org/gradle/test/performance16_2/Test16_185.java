package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_185 {
    private final Production16_185 production = new Production16_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}