package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_225 {
    private final Production55_225 production = new Production55_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}