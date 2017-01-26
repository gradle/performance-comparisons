package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_210 {
    private final Production37_210 production = new Production37_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}