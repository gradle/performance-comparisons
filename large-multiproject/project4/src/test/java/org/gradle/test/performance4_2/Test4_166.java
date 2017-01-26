package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_166 {
    private final Production4_166 production = new Production4_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}