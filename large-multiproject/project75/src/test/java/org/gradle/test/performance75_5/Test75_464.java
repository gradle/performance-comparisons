package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_464 {
    private final Production75_464 production = new Production75_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}