package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_28 {
    private final Production41_28 production = new Production41_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}