package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_40 {
    private final Production55_40 production = new Production55_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}