package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_41 {
    private final Production41_41 production = new Production41_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}