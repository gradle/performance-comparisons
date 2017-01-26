package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_424 {
    private final Production75_424 production = new Production75_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}