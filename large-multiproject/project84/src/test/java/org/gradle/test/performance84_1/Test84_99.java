package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_99 {
    private final Production84_99 production = new Production84_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}