package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_401 {
    private final Production75_401 production = new Production75_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}