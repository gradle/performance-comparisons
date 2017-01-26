package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_259 {
    private final Production84_259 production = new Production84_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}