package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_233 {
    private final Production97_233 production = new Production97_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}