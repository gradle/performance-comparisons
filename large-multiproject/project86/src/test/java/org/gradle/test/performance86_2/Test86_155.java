package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_155 {
    private final Production86_155 production = new Production86_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}