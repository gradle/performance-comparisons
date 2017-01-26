package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_320 {
    private final Production84_320 production = new Production84_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}