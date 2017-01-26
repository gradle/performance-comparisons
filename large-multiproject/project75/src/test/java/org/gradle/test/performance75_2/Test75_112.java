package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_112 {
    private final Production75_112 production = new Production75_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}