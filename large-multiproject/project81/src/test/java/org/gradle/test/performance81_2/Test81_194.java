package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_194 {
    private final Production81_194 production = new Production81_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}