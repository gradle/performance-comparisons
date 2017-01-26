package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_366 {
    private final Production87_366 production = new Production87_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}