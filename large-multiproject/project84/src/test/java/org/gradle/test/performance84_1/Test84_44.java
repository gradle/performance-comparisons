package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_44 {
    private final Production84_44 production = new Production84_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}