package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_366 {
    private final Production29_366 production = new Production29_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}