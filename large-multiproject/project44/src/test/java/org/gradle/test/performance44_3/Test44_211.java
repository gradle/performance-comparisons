package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_211 {
    private final Production44_211 production = new Production44_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}