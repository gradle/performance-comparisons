package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_112 {
    private final Production47_112 production = new Production47_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}