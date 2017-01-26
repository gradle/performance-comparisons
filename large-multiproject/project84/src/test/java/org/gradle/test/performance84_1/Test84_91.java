package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_91 {
    private final Production84_91 production = new Production84_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}