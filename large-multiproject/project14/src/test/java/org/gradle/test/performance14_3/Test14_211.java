package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_211 {
    private final Production14_211 production = new Production14_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}