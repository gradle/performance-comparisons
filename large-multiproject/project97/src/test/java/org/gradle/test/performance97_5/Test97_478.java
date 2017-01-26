package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_478 {
    private final Production97_478 production = new Production97_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}