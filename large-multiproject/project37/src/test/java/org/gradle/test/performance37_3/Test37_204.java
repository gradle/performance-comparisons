package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_204 {
    private final Production37_204 production = new Production37_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}