package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_492 {
    private final Production37_492 production = new Production37_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}