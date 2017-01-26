package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_131 {
    private final Production75_131 production = new Production75_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}