package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_397 {
    private final Production43_397 production = new Production43_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}