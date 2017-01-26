package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_500 {
    private final Production55_500 production = new Production55_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}