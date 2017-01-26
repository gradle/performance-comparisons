package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_38 {
    private final Production84_38 production = new Production84_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}