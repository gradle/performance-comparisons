package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_388 {
    private final Production55_388 production = new Production55_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}