package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_397 {
    private final Production79_397 production = new Production79_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}