package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_474 {
    private final Production41_474 production = new Production41_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}