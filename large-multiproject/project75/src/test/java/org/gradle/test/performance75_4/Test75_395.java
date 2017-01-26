package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_395 {
    private final Production75_395 production = new Production75_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}