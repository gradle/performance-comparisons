package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_155 {
    private final Production67_155 production = new Production67_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}