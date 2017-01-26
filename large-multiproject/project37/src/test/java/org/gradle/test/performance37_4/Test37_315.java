package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_315 {
    private final Production37_315 production = new Production37_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}