package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_211 {
    private final Production73_211 production = new Production73_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}