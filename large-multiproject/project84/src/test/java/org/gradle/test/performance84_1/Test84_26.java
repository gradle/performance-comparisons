package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_26 {
    private final Production84_26 production = new Production84_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}