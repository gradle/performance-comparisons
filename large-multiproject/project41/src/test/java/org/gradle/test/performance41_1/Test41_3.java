package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_3 {
    private final Production41_3 production = new Production41_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}