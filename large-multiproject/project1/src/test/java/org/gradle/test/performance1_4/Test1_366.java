package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_366 {
    private final Production1_366 production = new Production1_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}