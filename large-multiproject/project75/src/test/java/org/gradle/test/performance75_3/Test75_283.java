package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_283 {
    private final Production75_283 production = new Production75_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}