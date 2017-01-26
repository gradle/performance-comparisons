package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_35 {
    private final Production75_35 production = new Production75_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}