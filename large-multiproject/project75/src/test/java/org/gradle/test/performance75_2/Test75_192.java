package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_192 {
    private final Production75_192 production = new Production75_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}