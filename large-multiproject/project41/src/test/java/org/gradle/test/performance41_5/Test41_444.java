package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_444 {
    private final Production41_444 production = new Production41_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}