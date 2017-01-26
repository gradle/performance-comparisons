package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_29 {
    private final Production41_29 production = new Production41_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}