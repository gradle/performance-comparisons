package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_397 {
    private final Production39_397 production = new Production39_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}