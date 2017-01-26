package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_106 {
    private final Production55_106 production = new Production55_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}