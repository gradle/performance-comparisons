package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_379 {
    private final Production89_379 production = new Production89_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}