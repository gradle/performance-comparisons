package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_109 {
    private final Production75_109 production = new Production75_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}