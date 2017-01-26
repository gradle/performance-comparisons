package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_155 {
    private final Production20_155 production = new Production20_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}