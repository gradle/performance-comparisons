package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_54 {
    private final Production75_54 production = new Production75_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}