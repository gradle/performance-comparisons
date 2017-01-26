package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_139 {
    private final Production89_139 production = new Production89_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}