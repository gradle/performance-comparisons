package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_80 {
    private final Production84_80 production = new Production84_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}