package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_379 {
    private final Production75_379 production = new Production75_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}