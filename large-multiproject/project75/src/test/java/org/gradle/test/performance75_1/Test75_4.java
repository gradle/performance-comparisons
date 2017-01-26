package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_4 {
    private final Production75_4 production = new Production75_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}