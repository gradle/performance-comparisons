package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_131 {
    private final Production89_131 production = new Production89_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}