package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_187 {
    private final Production75_187 production = new Production75_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}