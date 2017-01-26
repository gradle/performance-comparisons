package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_119 {
    private final Production55_119 production = new Production55_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}