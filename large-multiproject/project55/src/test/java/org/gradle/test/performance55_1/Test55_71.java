package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_71 {
    private final Production55_71 production = new Production55_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}