package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_214 {
    private final Production55_214 production = new Production55_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}