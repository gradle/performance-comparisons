package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_476 {
    private final Production84_476 production = new Production84_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}