package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_434 {
    private final Production97_434 production = new Production97_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}