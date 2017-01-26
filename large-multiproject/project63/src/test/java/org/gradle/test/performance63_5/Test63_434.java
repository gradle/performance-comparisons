package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_434 {
    private final Production63_434 production = new Production63_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}