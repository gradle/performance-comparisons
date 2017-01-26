package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_213 {
    private final Production37_213 production = new Production37_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}