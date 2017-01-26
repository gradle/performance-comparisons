package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_329 {
    private final Production84_329 production = new Production84_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}