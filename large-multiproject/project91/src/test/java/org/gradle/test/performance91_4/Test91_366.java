package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_366 {
    private final Production91_366 production = new Production91_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}