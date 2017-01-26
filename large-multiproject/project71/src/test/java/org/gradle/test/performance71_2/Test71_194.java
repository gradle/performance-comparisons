package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_194 {
    private final Production71_194 production = new Production71_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}