package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_397 {
    private final Production81_397 production = new Production81_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}