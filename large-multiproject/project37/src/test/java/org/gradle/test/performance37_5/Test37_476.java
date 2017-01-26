package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_476 {
    private final Production37_476 production = new Production37_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}