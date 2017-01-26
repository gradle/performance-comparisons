package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_33 {
    private final Production75_33 production = new Production75_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}