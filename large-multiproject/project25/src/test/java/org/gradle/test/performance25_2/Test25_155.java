package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_155 {
    private final Production25_155 production = new Production25_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}