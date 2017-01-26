package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_477 {
    private final Production37_477 production = new Production37_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}