package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_139 {
    private final Production75_139 production = new Production75_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}