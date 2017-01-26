package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_398 {
    private final Production37_398 production = new Production37_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}