package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_116 {
    private final Production53_116 production = new Production53_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}