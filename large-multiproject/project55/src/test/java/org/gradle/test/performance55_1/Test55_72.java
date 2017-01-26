package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_72 {
    private final Production55_72 production = new Production55_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}