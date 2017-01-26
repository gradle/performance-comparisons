package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_267 {
    private final Production55_267 production = new Production55_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}