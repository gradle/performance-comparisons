package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_246 {
    private final Production41_246 production = new Production41_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}