package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_260 {
    private final Production37_260 production = new Production37_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}