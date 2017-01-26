package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_256 {
    private final Production16_256 production = new Production16_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}