package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_391 {
    private final Production97_391 production = new Production97_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}