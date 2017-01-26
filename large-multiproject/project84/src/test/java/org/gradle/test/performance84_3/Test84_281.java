package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_281 {
    private final Production84_281 production = new Production84_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}