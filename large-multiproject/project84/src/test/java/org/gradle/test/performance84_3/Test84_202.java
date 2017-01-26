package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_202 {
    private final Production84_202 production = new Production84_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}