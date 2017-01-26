package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_1 {
    private final Production75_1 production = new Production75_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}