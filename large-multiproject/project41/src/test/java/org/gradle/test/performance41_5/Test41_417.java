package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_417 {
    private final Production41_417 production = new Production41_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}