package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_166 {
    private final Production55_166 production = new Production55_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}