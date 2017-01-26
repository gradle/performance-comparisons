package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_8 {
    private final Production41_8 production = new Production41_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}