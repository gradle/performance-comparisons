package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_321 {
    private final Production75_321 production = new Production75_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}