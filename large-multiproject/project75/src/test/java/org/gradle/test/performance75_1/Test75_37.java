package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_37 {
    private final Production75_37 production = new Production75_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}