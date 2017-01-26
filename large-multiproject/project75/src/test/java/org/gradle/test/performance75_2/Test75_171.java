package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_171 {
    private final Production75_171 production = new Production75_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}