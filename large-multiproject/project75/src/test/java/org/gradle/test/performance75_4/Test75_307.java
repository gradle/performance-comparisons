package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_307 {
    private final Production75_307 production = new Production75_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}