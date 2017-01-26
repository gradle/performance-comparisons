package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_62 {
    private final Production41_62 production = new Production41_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}