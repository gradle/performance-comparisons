package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_134 {
    private final Production84_134 production = new Production84_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}