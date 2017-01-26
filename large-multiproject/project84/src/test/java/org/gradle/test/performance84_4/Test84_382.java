package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_382 {
    private final Production84_382 production = new Production84_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}