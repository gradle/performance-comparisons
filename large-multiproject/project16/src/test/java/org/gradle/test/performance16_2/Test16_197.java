package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_197 {
    private final Production16_197 production = new Production16_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}