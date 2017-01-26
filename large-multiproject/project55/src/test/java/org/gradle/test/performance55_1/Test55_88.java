package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_88 {
    private final Production55_88 production = new Production55_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}