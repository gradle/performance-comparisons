package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_114 {
    private final Production75_114 production = new Production75_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}