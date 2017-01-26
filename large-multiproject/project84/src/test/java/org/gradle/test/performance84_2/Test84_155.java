package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_155 {
    private final Production84_155 production = new Production84_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}