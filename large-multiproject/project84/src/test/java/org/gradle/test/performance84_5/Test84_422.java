package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_422 {
    private final Production84_422 production = new Production84_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}