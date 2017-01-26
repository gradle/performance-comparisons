package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_155 {
    private final Production90_155 production = new Production90_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}