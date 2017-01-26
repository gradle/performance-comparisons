package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_48 {
    private final Production75_48 production = new Production75_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}