package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_156 {
    private final Production37_156 production = new Production37_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}