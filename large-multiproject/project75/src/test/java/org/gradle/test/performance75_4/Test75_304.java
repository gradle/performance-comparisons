package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_304 {
    private final Production75_304 production = new Production75_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}