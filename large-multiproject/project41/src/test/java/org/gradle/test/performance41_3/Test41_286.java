package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_286 {
    private final Production41_286 production = new Production41_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}