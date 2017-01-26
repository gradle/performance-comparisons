package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_397 {
    private final Production49_397 production = new Production49_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}