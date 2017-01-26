package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_415 {
    private final Production41_415 production = new Production41_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}