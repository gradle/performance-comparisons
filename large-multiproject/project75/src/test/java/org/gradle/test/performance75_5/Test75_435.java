package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_435 {
    private final Production75_435 production = new Production75_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}