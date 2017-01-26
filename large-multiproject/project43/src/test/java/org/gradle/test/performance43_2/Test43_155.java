package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_155 {
    private final Production43_155 production = new Production43_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}