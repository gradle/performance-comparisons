package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_357 {
    private final Production37_357 production = new Production37_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}