package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_211 {
    private final Production85_211 production = new Production85_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}