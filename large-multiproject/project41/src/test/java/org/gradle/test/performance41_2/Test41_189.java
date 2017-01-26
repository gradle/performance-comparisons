package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_189 {
    private final Production41_189 production = new Production41_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}