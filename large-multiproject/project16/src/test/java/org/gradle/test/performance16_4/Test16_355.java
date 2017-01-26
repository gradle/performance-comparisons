package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_355 {
    private final Production16_355 production = new Production16_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}