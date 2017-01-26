package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_397 {
    private final Production65_397 production = new Production65_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}