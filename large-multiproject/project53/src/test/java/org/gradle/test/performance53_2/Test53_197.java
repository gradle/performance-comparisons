package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_197 {
    private final Production53_197 production = new Production53_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}