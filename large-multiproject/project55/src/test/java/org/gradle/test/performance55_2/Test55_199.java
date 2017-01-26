package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_199 {
    private final Production55_199 production = new Production55_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}