package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_164 {
    private final Production37_164 production = new Production37_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}