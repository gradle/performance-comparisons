package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_432 {
    private final Production41_432 production = new Production41_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}