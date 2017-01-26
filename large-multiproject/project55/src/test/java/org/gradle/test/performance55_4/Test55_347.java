package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_347 {
    private final Production55_347 production = new Production55_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}