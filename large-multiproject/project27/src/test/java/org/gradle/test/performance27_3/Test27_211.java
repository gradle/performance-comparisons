package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_211 {
    private final Production27_211 production = new Production27_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}