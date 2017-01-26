package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_362 {
    private final Production84_362 production = new Production84_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}