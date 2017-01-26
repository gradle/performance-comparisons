package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_116 {
    private final Production16_116 production = new Production16_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}