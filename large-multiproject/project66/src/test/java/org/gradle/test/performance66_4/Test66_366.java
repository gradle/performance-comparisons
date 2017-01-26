package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_366 {
    private final Production66_366 production = new Production66_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}