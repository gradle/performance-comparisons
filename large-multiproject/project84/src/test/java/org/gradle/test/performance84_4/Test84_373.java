package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_373 {
    private final Production84_373 production = new Production84_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}