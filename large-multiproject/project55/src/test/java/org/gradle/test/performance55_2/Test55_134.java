package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_134 {
    private final Production55_134 production = new Production55_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}