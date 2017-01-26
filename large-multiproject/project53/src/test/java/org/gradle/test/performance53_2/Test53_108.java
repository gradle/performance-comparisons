package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_108 {
    private final Production53_108 production = new Production53_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}