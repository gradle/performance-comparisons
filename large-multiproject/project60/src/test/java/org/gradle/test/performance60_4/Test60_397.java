package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_397 {
    private final Production60_397 production = new Production60_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}