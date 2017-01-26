package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_155 {
    private final Production75_155 production = new Production75_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}