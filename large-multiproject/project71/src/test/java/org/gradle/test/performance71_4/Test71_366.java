package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_366 {
    private final Production71_366 production = new Production71_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}