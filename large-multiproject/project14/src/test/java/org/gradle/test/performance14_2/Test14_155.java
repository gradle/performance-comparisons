package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_155 {
    private final Production14_155 production = new Production14_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}