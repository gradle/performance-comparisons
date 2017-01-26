package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_211 {
    private final Production59_211 production = new Production59_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}