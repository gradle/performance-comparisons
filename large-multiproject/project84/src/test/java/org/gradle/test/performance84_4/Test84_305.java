package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_305 {
    private final Production84_305 production = new Production84_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}