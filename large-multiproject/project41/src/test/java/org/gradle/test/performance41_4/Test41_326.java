package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_326 {
    private final Production41_326 production = new Production41_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}