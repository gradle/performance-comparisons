package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_3 {
    private final Production55_3 production = new Production55_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}