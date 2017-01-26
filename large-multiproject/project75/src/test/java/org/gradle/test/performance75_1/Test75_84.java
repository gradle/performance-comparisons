package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_84 {
    private final Production75_84 production = new Production75_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}