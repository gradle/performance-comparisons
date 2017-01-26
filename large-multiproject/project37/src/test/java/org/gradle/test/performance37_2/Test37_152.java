package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_152 {
    private final Production37_152 production = new Production37_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}