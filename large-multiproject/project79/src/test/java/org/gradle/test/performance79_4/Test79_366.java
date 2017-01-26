package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_366 {
    private final Production79_366 production = new Production79_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}