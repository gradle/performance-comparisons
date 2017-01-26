package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_51 {
    private final Production75_51 production = new Production75_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}