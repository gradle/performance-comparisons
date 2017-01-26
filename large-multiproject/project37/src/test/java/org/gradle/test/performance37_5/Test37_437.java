package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_437 {
    private final Production37_437 production = new Production37_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}