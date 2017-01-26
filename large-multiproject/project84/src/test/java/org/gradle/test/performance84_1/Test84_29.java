package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_29 {
    private final Production84_29 production = new Production84_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}