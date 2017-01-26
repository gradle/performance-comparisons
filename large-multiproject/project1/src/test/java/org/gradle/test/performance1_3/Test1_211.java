package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_211 {
    private final Production1_211 production = new Production1_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}