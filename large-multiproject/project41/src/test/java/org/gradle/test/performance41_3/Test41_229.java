package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_229 {
    private final Production41_229 production = new Production41_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}