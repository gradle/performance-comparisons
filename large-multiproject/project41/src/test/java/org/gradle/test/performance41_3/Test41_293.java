package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_293 {
    private final Production41_293 production = new Production41_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}