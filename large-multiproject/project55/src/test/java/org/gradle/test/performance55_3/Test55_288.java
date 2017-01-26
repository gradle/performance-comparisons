package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_288 {
    private final Production55_288 production = new Production55_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}