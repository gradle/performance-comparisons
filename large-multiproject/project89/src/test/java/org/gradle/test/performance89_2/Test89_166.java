package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_166 {
    private final Production89_166 production = new Production89_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}