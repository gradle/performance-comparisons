package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_80 {
    private final Production55_80 production = new Production55_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}