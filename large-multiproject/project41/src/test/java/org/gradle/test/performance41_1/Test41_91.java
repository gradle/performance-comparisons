package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_91 {
    private final Production41_91 production = new Production41_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}