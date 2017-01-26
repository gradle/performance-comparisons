package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_155 {
    private final Production30_155 production = new Production30_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}