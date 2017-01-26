package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_81 {
    private final Production37_81 production = new Production37_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}