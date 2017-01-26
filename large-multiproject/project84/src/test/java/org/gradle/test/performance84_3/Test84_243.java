package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_243 {
    private final Production84_243 production = new Production84_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}