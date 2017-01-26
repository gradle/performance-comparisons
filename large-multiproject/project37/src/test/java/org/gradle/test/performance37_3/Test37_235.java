package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_235 {
    private final Production37_235 production = new Production37_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}