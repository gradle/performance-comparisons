package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_317 {
    private final Production75_317 production = new Production75_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}