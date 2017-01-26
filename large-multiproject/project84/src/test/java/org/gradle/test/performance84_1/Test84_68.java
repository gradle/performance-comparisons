package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_68 {
    private final Production84_68 production = new Production84_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}