package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_99 {
    private final Production75_99 production = new Production75_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}