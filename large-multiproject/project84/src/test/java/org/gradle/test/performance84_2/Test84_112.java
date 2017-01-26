package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_112 {
    private final Production84_112 production = new Production84_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}