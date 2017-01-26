package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_97 {
    private final Production55_97 production = new Production55_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}