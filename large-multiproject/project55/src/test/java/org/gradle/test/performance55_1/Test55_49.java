package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_49 {
    private final Production55_49 production = new Production55_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}