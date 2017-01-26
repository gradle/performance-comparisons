package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_366 {
    private final Production85_366 production = new Production85_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}