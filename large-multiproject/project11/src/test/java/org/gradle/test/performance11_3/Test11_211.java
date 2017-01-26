package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_211 {
    private final Production11_211 production = new Production11_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}