package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_290 {
    private final Production37_290 production = new Production37_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}