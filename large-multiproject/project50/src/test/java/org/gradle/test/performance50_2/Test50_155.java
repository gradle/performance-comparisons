package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_155 {
    private final Production50_155 production = new Production50_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}