package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_358 {
    private final Production75_358 production = new Production75_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}