package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_434 {
    private final Production92_434 production = new Production92_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}