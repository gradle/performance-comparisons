package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_338 {
    private final Production41_338 production = new Production41_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}