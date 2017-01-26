package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_155 {
    private final Production93_155 production = new Production93_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}