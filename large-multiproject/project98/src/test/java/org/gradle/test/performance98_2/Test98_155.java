package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_155 {
    private final Production98_155 production = new Production98_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}