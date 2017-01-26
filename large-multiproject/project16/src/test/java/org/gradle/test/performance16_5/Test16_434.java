package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_434 {
    private final Production16_434 production = new Production16_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}