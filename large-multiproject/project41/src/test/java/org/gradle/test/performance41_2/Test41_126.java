package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_126 {
    private final Production41_126 production = new Production41_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}