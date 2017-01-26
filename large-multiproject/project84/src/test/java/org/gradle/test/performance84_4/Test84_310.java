package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_310 {
    private final Production84_310 production = new Production84_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}