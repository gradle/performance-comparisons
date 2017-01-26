package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_307 {
    private final Production4_307 production = new Production4_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}