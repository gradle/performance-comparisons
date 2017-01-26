package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_434 {
    private final Production89_434 production = new Production89_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}