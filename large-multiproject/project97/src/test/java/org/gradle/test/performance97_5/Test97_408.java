package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_408 {
    private final Production97_408 production = new Production97_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}