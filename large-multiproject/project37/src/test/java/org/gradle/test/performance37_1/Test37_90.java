package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_90 {
    private final Production37_90 production = new Production37_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}