package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_491 {
    private final Production97_491 production = new Production97_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}