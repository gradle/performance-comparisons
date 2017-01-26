package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_464 {
    private final Production37_464 production = new Production37_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}