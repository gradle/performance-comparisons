package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_437 {
    private final Production55_437 production = new Production55_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}