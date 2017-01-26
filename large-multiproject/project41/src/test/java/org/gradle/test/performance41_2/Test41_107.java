package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_107 {
    private final Production41_107 production = new Production41_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}