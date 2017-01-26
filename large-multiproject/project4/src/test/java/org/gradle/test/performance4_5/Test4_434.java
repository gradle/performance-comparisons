package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_434 {
    private final Production4_434 production = new Production4_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}