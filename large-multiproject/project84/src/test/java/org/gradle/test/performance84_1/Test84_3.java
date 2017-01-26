package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_3 {
    private final Production84_3 production = new Production84_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}