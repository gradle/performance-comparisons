package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_134 {
    private final Production75_134 production = new Production75_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}