package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_81 {
    private final Production75_81 production = new Production75_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}