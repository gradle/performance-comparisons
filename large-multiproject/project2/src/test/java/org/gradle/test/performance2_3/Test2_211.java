package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_211 {
    private final Production2_211 production = new Production2_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}