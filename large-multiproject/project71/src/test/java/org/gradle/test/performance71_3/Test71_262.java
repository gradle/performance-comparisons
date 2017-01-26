package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_262 {
    private final Production71_262 production = new Production71_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}