package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_137 {
    private final Production75_137 production = new Production75_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}