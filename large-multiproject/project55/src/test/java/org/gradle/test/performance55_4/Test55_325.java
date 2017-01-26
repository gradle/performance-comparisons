package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_325 {
    private final Production55_325 production = new Production55_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}