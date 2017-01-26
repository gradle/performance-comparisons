package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_360 {
    private final Production41_360 production = new Production41_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}