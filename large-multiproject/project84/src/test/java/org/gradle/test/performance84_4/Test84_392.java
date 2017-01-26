package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_392 {
    private final Production84_392 production = new Production84_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}