package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_70 {
    private final Production75_70 production = new Production75_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}