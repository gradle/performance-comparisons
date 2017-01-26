package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_186 {
    private final Production37_186 production = new Production37_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}