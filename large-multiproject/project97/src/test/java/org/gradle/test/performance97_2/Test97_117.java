package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_117 {
    private final Production97_117 production = new Production97_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}