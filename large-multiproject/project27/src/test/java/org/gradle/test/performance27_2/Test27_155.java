package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_155 {
    private final Production27_155 production = new Production27_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}