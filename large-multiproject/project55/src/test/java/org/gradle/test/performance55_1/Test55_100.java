package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_100 {
    private final Production55_100 production = new Production55_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}