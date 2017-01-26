package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_366 {
    private final Production60_366 production = new Production60_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}