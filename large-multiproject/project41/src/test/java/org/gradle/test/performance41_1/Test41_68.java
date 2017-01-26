package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_68 {
    private final Production41_68 production = new Production41_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}