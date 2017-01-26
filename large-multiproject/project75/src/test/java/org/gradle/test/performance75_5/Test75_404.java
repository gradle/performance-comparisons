package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_404 {
    private final Production75_404 production = new Production75_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}