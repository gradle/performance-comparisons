package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_270 {
    private final Production37_270 production = new Production37_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}