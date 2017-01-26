package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_397 {
    private final Production87_397 production = new Production87_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}