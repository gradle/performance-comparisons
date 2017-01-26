package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_330 {
    private final Production84_330 production = new Production84_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}