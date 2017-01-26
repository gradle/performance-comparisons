package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_9 {
    private final Production41_9 production = new Production41_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}