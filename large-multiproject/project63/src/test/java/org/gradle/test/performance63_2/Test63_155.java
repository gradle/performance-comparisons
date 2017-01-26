package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_155 {
    private final Production63_155 production = new Production63_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}