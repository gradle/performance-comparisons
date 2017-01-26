package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_366 {
    private final Production36_366 production = new Production36_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}