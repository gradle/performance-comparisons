package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_366 {
    private final Production11_366 production = new Production11_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}