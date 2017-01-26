package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_226 {
    private final Production89_226 production = new Production89_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}