package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_155 {
    private final Production3_155 production = new Production3_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}