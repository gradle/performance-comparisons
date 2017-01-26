package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_93 {
    private final Production55_93 production = new Production55_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}