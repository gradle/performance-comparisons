package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_25 {
    private final Production84_25 production = new Production84_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}