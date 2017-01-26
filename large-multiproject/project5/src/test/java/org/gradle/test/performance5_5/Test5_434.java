package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_434 {
    private final Production5_434 production = new Production5_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}