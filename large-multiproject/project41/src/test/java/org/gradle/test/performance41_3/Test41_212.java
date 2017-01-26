package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_212 {
    private final Production41_212 production = new Production41_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}