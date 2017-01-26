package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_195 {
    private final Production84_195 production = new Production84_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}