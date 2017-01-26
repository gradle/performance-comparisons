package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_58 {
    private final Production84_58 production = new Production84_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}