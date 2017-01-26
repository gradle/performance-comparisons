package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_211 {
    private final Production79_211 production = new Production79_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}