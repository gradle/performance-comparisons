package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_133 {
    private final Production53_133 production = new Production53_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}