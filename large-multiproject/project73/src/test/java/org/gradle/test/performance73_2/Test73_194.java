package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_194 {
    private final Production73_194 production = new Production73_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}