package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_451 {
    private final Production97_451 production = new Production97_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}