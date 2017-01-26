package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_366 {
    private final Production2_366 production = new Production2_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}