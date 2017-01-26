package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_166 {
    private final Production47_166 production = new Production47_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}