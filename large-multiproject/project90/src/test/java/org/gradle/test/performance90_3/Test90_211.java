package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_211 {
    private final Production90_211 production = new Production90_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}