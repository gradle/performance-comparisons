package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_392 {
    private final Production55_392 production = new Production55_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}