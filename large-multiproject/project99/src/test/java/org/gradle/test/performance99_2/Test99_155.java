package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_155 {
    private final Production99_155 production = new Production99_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}