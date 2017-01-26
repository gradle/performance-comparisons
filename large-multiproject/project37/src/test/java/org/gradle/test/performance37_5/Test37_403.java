package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_403 {
    private final Production37_403 production = new Production37_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}