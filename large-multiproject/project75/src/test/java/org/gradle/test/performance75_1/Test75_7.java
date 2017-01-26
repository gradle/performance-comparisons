package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_7 {
    private final Production75_7 production = new Production75_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}