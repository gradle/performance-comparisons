package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_187 {
    private final Production37_187 production = new Production37_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}