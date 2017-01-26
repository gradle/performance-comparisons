package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_96 {
    private final Production84_96 production = new Production84_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}