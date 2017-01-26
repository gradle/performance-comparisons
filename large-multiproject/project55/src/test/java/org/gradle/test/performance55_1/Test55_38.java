package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_38 {
    private final Production55_38 production = new Production55_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}