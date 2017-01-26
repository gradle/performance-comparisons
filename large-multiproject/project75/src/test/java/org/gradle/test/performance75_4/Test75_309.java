package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_309 {
    private final Production75_309 production = new Production75_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}