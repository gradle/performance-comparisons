package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_155 {
    private final Production35_155 production = new Production35_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}