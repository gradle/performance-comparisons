package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_388 {
    private final Production84_388 production = new Production84_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}