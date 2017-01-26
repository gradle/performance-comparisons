package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_162 {
    private final Production75_162 production = new Production75_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}