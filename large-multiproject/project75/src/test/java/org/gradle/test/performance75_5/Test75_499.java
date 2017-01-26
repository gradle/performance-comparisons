package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_499 {
    private final Production75_499 production = new Production75_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}