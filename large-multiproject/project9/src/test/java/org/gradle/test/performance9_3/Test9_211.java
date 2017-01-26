package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_211 {
    private final Production9_211 production = new Production9_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}