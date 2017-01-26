package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_53 {
    private final Production84_53 production = new Production84_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}