package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_106 {
    private final Production84_106 production = new Production84_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}