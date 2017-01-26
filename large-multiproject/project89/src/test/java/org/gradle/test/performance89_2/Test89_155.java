package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_155 {
    private final Production89_155 production = new Production89_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}