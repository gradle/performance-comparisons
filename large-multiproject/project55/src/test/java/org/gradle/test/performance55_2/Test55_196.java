package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_196 {
    private final Production55_196 production = new Production55_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}