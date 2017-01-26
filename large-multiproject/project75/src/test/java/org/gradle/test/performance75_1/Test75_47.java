package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_47 {
    private final Production75_47 production = new Production75_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}