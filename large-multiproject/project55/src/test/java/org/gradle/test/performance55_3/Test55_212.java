package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_212 {
    private final Production55_212 production = new Production55_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}