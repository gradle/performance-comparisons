package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_155 {
    private final Production9_155 production = new Production9_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}