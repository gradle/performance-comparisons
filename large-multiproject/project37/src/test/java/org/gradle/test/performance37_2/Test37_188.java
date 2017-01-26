package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_188 {
    private final Production37_188 production = new Production37_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}