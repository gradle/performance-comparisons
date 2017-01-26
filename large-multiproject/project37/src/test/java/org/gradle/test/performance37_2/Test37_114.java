package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_114 {
    private final Production37_114 production = new Production37_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}