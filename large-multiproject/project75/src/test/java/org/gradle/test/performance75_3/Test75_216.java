package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_216 {
    private final Production75_216 production = new Production75_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}