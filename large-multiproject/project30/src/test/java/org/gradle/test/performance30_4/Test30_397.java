package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_397 {
    private final Production30_397 production = new Production30_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}