package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_495 {
    private final Production41_495 production = new Production41_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}