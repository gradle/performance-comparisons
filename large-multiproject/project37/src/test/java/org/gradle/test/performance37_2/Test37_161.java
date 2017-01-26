package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_161 {
    private final Production37_161 production = new Production37_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}