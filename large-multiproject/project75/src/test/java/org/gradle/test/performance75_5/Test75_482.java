package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_482 {
    private final Production75_482 production = new Production75_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}