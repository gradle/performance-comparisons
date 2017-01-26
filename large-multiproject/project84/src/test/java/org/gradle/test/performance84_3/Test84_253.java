package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_253 {
    private final Production84_253 production = new Production84_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}