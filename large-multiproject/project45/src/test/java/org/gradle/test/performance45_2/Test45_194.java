package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_194 {
    private final Production45_194 production = new Production45_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}