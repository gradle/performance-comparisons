package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_202 {
    private final Production41_202 production = new Production41_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}