package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_34 {
    private final Production75_34 production = new Production75_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}