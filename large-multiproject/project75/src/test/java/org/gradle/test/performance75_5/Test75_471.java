package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_471 {
    private final Production75_471 production = new Production75_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}