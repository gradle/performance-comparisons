package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_67 {
    private final Production41_67 production = new Production41_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}