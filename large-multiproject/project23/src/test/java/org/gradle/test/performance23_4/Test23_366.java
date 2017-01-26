package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_366 {
    private final Production23_366 production = new Production23_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}