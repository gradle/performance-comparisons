package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_211 {
    private final Production65_211 production = new Production65_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}