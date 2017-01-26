package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_77 {
    private final Production84_77 production = new Production84_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}