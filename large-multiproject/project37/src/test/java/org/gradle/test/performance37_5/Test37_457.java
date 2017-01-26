package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_457 {
    private final Production37_457 production = new Production37_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}