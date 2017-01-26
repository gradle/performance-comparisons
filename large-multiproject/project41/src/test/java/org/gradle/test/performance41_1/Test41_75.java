package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_75 {
    private final Production41_75 production = new Production41_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}