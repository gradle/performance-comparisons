package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_155 {
    private final Production13_155 production = new Production13_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}