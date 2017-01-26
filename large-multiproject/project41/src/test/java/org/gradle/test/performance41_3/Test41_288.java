package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_288 {
    private final Production41_288 production = new Production41_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}