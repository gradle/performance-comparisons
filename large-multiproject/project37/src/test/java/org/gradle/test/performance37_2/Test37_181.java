package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_181 {
    private final Production37_181 production = new Production37_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}