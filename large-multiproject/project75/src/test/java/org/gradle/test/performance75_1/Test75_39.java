package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_39 {
    private final Production75_39 production = new Production75_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}