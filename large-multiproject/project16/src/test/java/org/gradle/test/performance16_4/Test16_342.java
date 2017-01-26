package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_342 {
    private final Production16_342 production = new Production16_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}