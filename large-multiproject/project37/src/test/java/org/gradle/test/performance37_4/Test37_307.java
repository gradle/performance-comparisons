package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_307 {
    private final Production37_307 production = new Production37_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}