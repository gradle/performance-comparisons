package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_307 {
    private final Production63_307 production = new Production63_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}