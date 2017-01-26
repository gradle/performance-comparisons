package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_397 {
    private final Production26_397 production = new Production26_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}