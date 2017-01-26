package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_86 {
    private final Production53_86 production = new Production53_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}