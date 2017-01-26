package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_166 {
    private final Production75_166 production = new Production75_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}