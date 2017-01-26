package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_6 {
    private final Production75_6 production = new Production75_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}