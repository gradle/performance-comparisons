package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_184 {
    private final Production53_184 production = new Production53_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}