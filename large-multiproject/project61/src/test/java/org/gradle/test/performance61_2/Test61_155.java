package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_155 {
    private final Production61_155 production = new Production61_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}