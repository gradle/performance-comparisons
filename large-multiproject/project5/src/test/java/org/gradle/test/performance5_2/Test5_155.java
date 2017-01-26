package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_155 {
    private final Production5_155 production = new Production5_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}