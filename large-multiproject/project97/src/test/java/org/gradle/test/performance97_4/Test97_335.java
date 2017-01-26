package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_335 {
    private final Production97_335 production = new Production97_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}