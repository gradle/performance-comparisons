package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_63 {
    private final Production75_63 production = new Production75_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}