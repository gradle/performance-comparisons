package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_211 {
    private final Production51_211 production = new Production51_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}