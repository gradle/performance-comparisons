package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_397 {
    private final Production15_397 production = new Production15_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}