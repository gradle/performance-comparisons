package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_326 {
    private final Production55_326 production = new Production55_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}