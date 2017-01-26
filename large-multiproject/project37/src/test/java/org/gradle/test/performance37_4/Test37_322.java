package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_322 {
    private final Production37_322 production = new Production37_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}