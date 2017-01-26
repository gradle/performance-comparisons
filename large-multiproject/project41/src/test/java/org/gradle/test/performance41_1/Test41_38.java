package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_38 {
    private final Production41_38 production = new Production41_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}