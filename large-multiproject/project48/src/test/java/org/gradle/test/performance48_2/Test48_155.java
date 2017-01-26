package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_155 {
    private final Production48_155 production = new Production48_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}