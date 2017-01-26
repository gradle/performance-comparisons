package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_307 {
    private final Production84_307 production = new Production84_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}