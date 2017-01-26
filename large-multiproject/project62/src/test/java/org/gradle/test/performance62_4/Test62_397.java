package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_397 {
    private final Production62_397 production = new Production62_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}