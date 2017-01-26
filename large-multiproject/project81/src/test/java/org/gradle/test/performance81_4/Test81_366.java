package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_366 {
    private final Production81_366 production = new Production81_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}