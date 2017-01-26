package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_450 {
    private final Production75_450 production = new Production75_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}