package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_200 {
    private final Production84_200 production = new Production84_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}