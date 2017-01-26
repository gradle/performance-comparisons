package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_365 {
    private final Production84_365 production = new Production84_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}