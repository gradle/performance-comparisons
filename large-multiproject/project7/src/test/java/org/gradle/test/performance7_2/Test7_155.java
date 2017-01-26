package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_155 {
    private final Production7_155 production = new Production7_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}