package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_164 {
    private final Production75_164 production = new Production75_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}