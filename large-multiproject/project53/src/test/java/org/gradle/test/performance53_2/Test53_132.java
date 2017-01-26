package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_132 {
    private final Production53_132 production = new Production53_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}