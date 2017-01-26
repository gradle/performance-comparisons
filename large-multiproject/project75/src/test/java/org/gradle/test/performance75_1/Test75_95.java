package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_95 {
    private final Production75_95 production = new Production75_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}