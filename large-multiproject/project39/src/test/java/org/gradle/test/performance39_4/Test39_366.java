package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_366 {
    private final Production39_366 production = new Production39_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}