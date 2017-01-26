package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_34 {
    private final Production84_34 production = new Production84_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}