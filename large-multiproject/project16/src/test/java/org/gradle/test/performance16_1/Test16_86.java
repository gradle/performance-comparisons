package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_86 {
    private final Production16_86 production = new Production16_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}