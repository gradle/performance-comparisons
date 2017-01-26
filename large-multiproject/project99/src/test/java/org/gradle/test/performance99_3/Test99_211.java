package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_211 {
    private final Production99_211 production = new Production99_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}