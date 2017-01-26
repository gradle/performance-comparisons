package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_347 {
    private final Production41_347 production = new Production41_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}