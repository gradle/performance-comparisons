package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_427 {
    private final Production55_427 production = new Production55_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}