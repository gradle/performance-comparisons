package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_211 {
    private final Production52_211 production = new Production52_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}