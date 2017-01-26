package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_172 {
    private final Production41_172 production = new Production41_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}