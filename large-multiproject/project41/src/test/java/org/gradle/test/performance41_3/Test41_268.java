package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_268 {
    private final Production41_268 production = new Production41_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}