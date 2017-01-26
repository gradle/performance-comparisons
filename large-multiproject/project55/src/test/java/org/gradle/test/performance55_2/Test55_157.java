package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_157 {
    private final Production55_157 production = new Production55_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}