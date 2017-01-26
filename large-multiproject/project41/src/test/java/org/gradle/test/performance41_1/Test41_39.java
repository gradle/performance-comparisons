package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_39 {
    private final Production41_39 production = new Production41_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}