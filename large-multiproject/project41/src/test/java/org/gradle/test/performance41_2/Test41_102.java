package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_102 {
    private final Production41_102 production = new Production41_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}