package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_53 {
    private final Production37_53 production = new Production37_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}