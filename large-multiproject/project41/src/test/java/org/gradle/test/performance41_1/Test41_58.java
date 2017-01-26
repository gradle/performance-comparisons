package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_58 {
    private final Production41_58 production = new Production41_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}