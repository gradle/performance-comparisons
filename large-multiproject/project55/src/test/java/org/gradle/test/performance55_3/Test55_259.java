package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_259 {
    private final Production55_259 production = new Production55_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}