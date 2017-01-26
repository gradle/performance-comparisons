package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_458 {
    private final Production84_458 production = new Production84_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}