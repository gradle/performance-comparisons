package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_126 {
    private final Production55_126 production = new Production55_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}