package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_397 {
    private final Production97_397 production = new Production97_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}