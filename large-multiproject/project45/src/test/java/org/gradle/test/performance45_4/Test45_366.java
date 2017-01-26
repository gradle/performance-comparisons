package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_366 {
    private final Production45_366 production = new Production45_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}