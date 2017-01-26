package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_362 {
    private final Production41_362 production = new Production41_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}