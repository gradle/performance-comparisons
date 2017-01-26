package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_500 {
    private final Production84_500 production = new Production84_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}