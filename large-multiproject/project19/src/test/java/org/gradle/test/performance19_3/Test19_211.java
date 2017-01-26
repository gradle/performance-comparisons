package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_211 {
    private final Production19_211 production = new Production19_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}