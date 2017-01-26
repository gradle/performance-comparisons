package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_203 {
    private final Production37_203 production = new Production37_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}