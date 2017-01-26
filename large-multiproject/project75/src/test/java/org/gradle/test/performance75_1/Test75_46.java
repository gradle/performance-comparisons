package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_46 {
    private final Production75_46 production = new Production75_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}