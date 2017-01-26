package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_265 {
    private final Production75_265 production = new Production75_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}