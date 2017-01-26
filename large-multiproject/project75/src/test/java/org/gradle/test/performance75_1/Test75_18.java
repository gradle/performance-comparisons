package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_18 {
    private final Production75_18 production = new Production75_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}