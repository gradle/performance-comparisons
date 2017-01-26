package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_285 {
    private final Production97_285 production = new Production97_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}