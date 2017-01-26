package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_219 {
    private final Production53_219 production = new Production53_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}