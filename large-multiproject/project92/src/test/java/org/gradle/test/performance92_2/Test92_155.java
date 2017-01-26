package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_155 {
    private final Production92_155 production = new Production92_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}