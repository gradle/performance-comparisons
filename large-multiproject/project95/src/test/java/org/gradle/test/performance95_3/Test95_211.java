package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_211 {
    private final Production95_211 production = new Production95_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}