package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_289 {
    private final Production84_289 production = new Production84_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}