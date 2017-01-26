package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_307 {
    private final Production89_307 production = new Production89_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}