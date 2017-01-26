package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_366 {
    private final Production19_366 production = new Production19_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}