package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_268 {
    private final Production84_268 production = new Production84_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}