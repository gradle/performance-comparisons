package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_101 {
    private final Production53_101 production = new Production53_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}