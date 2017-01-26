package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_211 {
    private final Production33_211 production = new Production33_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}