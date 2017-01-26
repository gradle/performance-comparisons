package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_155 {
    private final Production62_155 production = new Production62_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}