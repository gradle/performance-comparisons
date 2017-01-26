package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_78 {
    private final Production55_78 production = new Production55_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}