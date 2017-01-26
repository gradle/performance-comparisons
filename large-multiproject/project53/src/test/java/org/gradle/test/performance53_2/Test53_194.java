package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_194 {
    private final Production53_194 production = new Production53_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}