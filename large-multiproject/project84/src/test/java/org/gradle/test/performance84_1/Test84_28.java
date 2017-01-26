package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_28 {
    private final Production84_28 production = new Production84_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}