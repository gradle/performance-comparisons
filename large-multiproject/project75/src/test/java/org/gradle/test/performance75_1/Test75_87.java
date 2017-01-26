package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_87 {
    private final Production75_87 production = new Production75_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}