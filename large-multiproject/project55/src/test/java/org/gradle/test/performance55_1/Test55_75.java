package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_75 {
    private final Production55_75 production = new Production55_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}