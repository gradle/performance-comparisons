package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_363 {
    private final Production75_363 production = new Production75_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}