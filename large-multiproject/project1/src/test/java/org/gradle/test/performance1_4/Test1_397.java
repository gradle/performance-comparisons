package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_397 {
    private final Production1_397 production = new Production1_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}