package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_205 {
    private final Production37_205 production = new Production37_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}