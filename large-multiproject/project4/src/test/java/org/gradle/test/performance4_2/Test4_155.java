package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_155 {
    private final Production4_155 production = new Production4_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}