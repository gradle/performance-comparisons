package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_43 {
    private final Production55_43 production = new Production55_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}