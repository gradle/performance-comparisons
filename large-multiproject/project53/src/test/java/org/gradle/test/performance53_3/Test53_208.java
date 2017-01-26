package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_208 {
    private final Production53_208 production = new Production53_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}