package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_19 {
    private final Production75_19 production = new Production75_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}