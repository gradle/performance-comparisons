package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_12 {
    private final Production75_12 production = new Production75_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}