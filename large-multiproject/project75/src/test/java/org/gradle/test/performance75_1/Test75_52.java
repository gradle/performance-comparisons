package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_52 {
    private final Production75_52 production = new Production75_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}