package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_366 {
    private final Production65_366 production = new Production65_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}