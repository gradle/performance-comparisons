package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_209 {
    private final Production41_209 production = new Production41_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}