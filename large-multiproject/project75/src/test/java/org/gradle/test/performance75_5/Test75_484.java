package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_484 {
    private final Production75_484 production = new Production75_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}