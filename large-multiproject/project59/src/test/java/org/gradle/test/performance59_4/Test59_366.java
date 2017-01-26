package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_366 {
    private final Production59_366 production = new Production59_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}