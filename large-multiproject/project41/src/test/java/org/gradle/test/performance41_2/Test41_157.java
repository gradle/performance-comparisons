package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_157 {
    private final Production41_157 production = new Production41_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}