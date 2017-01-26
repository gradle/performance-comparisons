package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_82 {
    private final Production41_82 production = new Production41_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}