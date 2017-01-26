package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_456 {
    private final Production53_456 production = new Production53_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}