package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_397 {
    private final Production14_397 production = new Production14_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}