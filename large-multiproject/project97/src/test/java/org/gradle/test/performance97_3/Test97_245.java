package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_245 {
    private final Production97_245 production = new Production97_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}