package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_144 {
    private final Production53_144 production = new Production53_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}