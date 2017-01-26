package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_419 {
    private final Production37_419 production = new Production37_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}