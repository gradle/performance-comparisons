package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_51 {
    private final Production84_51 production = new Production84_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}