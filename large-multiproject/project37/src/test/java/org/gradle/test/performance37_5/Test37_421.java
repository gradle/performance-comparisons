package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_421 {
    private final Production37_421 production = new Production37_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}