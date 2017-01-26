package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_313 {
    private final Production75_313 production = new Production75_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}