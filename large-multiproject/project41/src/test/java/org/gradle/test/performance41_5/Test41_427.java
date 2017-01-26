package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_427 {
    private final Production41_427 production = new Production41_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}