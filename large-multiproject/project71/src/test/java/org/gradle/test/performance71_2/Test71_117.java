package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_117 {
    private final Production71_117 production = new Production71_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}