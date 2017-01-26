package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_129 {
    private final Production53_129 production = new Production53_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}