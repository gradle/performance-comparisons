package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_209 {
    private final Production55_209 production = new Production55_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}