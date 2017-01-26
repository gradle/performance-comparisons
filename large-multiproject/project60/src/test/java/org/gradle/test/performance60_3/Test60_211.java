package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_211 {
    private final Production60_211 production = new Production60_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}