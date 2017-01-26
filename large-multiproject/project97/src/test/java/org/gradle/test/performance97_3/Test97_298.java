package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_298 {
    private final Production97_298 production = new Production97_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}