package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_184 {
    private final Production16_184 production = new Production16_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}