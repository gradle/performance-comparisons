package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_194 {
    private final Production15_194 production = new Production15_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}