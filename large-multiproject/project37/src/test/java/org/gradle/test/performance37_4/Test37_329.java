package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_329 {
    private final Production37_329 production = new Production37_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}