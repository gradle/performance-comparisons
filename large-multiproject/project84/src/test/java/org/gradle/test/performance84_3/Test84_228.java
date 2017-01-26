package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_228 {
    private final Production84_228 production = new Production84_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}