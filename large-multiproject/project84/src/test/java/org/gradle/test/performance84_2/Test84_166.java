package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_166 {
    private final Production84_166 production = new Production84_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}