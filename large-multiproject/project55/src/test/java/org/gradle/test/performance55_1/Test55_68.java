package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_68 {
    private final Production55_68 production = new Production55_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}