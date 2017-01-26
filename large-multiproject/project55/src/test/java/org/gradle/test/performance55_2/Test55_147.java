package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_147 {
    private final Production55_147 production = new Production55_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}