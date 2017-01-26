package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_403 {
    private final Production75_403 production = new Production75_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}