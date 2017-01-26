package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_364 {
    private final Production84_364 production = new Production84_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}