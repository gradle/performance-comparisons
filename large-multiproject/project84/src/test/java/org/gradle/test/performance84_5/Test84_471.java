package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_471 {
    private final Production84_471 production = new Production84_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}