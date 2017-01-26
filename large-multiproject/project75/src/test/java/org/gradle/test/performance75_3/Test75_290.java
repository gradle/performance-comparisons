package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_290 {
    private final Production75_290 production = new Production75_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}