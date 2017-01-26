package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_195 {
    private final Production55_195 production = new Production55_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}