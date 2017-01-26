package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_435 {
    private final Production84_435 production = new Production84_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}