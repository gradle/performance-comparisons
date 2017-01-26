package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_358 {
    private final Production55_358 production = new Production55_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}