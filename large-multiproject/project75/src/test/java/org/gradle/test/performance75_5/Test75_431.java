package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_431 {
    private final Production75_431 production = new Production75_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}