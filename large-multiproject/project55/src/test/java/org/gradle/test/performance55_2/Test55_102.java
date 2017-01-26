package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_102 {
    private final Production55_102 production = new Production55_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}