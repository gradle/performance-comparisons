package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_30 {
    private final Production75_30 production = new Production75_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}